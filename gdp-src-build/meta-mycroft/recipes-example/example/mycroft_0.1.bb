#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Simple helloworld application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

#RDEPENDS_${PN}-dev += "git"
#RDEPENDS_${PN}-dev += "python"
#RDEPENDS_${PN}-dev += "python-setuptools"
#RDEPENDS_${PN}-dev += "python-pygobject"
#RDEPENDS_${PN}-dev += "libtool"
#RDEPENDS_${PN}-dev += "libffi"
#RDEPENDS_${PN}-dev += "openssl"
#RDEPENDS_${PN}-dev += "autoconf"
#RDEPENDS_${PN}-dev += "bison"
#RDEPENDS_${PN}-dev += "swig"
#RDEPENDS_${PN}-dev += "glib-2.0"
#RDEPENDS_${PN}-dev += "flac"
#RDEPENDS_${PN}-dev += "curl"

SRC_URI = "file://mycroft-core-dev.zip"

S = "${WORKDIR}"

do_compile() {
}

do_install() {
}
#         install -d ${D}\home\root\sources
#         cp -r mycroft-core-dev ${D}\home\root\sources

