# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A text-to-intent parsing framework."
HOMEPAGE = "https://github.com/MycroftAI/adapt"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
# NOTE: License in setup.py/PKGINFO is: LGPL-3
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/amcgee7/adapt.git;protocol=https"

# Modify these as desired
PV = "0.3.0+git${SRCPV}"
SRCREV = "d48ed4b5600c302a4b2cebc4a1e3302cdbdd707c"

S = "${WORKDIR}/git"

inherit setuptools

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
# RDEPENDS_${PN} += "python-pyee python-six"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
# RDEPENDS_${PN} += "python-codecs python-core python-lang python-pprint python-re"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    six.moves
