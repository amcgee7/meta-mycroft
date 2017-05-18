#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Mimic TTS Engine"
SECTION = "Mycroft"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

MIMIC_VERSION = "1.2.0.2"

#SRCREV = "HEAD:e0d666f9ed96a3f3578e759d4d6b5b3847f2623f"
SRC_URI = "https://github.com/MycroftAI/${PN}/archive/${MIMIC_VERSION}.tar.gz;protocol=http"
SRC_URI[sha256sum] = "6adcc9911b09d6e9513add41ad9dfc0893ece277f556419869520a0f0708c102"

S = "${WORKDIR}/${PN}-${MIMIC_VERSION}"

DEPENDS = " gcc pulseaudio pkgconfig "

RDEPENDS_${PN} = " gcc pulseaudio pkgconfig "

inherit autotools

#do_configure () {
#    cd ${S}
#    NOCONFIGURE=true ./autogen.sh && \ 
#        ./configure --host=${HOST_SYS} --target=${TARGET_SYS} \
#        --with-audio=alsa --enable-remote=yes
#    oe_runconf
#    #export TARGET_CFLAGS="-D_DEFAULT_SOURCE $(CFLAGS)"
#    #make 
#    #oe_runmake
#}
#
#do_install () {
#   cd ${S}
#   oe_runmake
#}
