#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Mimic TTS Engine"
SECTION = "Mycroft"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

MIMIC_VERSION = "1.2.0.1"

#SRCREV = "HEAD:e0d666f9ed96a3f3578e759d4d6b5b3847f2623f"
SRC_URI = "https://github.com/MycroftAI/${PN}/archive/${MIMIC_VERSION}.tar.gz;protocol=http"

#SRC_URI[md5sum] = "6bd2a4e2349a8491542b2fd7739c67b8" # 1.2.0
#SRC_URI[md5sum] = "db1321f214aca32a8673031b39e988e3" # 1.1.0
SRC_URI[md5sum] = "3b58d5cb94ba2fb2339701300020b857"
SRC_URI[sha256sum] = "fc755b9e8ba087dde6f0c8dfc331bc680fd257d4d06acb9929b720d7c16c222e"

S = "${WORKDIR}/${PN}-${MIMIC_VERSION}"

DEPENDS = " gcc pulseaudio pkgconfig "

RDEPENDS_${PN} = " gcc pulseaudio pkgconfig "

inherit autotools

do_configure () {
    cd ${S}
    NOCONFIGURE=true ./autogen.sh && \ 
        ./configure --host=${HOST_SYS} --target=${TARGET_SYS} \
        --with-audio=alsa --enable-remote=yes
    oe_runconf
    #export TARGET_CFLAGS="-D_DEFAULT_SOURCE $(CFLAGS)"
    #make 
    #oe_runmake
}

do_install () {
   cd ${S}
   oe_runmake
}
