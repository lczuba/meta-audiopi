SUMMARY = "Encoder daemon"
DESCRIPTION = "Encoder daemon"
LICENSE = "CLOSED"

SRC_URI = "file://encoderd.cpp"

S = "${WORKDIR}"

do_compile() {
    ${CXX} encoderd.cpp ${LDFLAGS} -o encoderd 
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 encoderd ${D}${bindir}
}
