# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get spotifyd could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/spotifyd/0.3.3"
SRC_URI += "git://github.com/lczuba/spotifyd.git;protocol=https;nobranch=1"
SRCREV = "dbf88b0e5215ad55c29479345fcfadd610fee993"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+dbf88b0e52"

DEPENDS += "alsa-lib openssl"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.17.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aes-ctr/0.6.0 \
    crate://crates.io/aes-soft/0.6.4 \
    crate://crates.io/aes/0.6.0 \
    crate://crates.io/aes/0.7.5 \
    crate://crates.io/aesni/0.10.0 \
    crate://crates.io/aho-corasick/0.7.19 \
    crate://crates.io/alsa-sys/0.3.1 \
    crate://crates.io/alsa/0.5.0 \
    crate://crates.io/alsa/0.6.0 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/ansi_term/0.12.1 \
    crate://crates.io/async-io/1.9.0 \
    crate://crates.io/async-trait/0.1.57 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.66 \
    crate://crates.io/base64/0.13.0 \
    crate://crates.io/bindgen/0.59.2 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.3 \
    crate://crates.io/block-buffer/0.9.0 \
    crate://crates.io/block-modes/0.8.1 \
    crate://crates.io/block-padding/0.2.1 \
    crate://crates.io/boxfnonce/0.1.1 \
    crate://crates.io/bumpalo/3.11.0 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/0.4.12 \
    crate://crates.io/bytes/0.5.6 \
    crate://crates.io/bytes/1.2.1 \
    crate://crates.io/cache-padded/1.2.0 \
    crate://crates.io/cc/1.0.73 \
    crate://crates.io/cesu8/1.1.0 \
    crate://crates.io/cexpr/0.6.0 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.22 \
    crate://crates.io/chunked_transfer/1.4.0 \
    crate://crates.io/cipher/0.2.5 \
    crate://crates.io/cipher/0.3.0 \
    crate://crates.io/clang-sys/1.4.0 \
    crate://crates.io/clap/2.34.0 \
    crate://crates.io/cloudabi/0.0.3 \
    crate://crates.io/color-eyre/0.5.11 \
    crate://crates.io/color-spantrace/0.1.6 \
    crate://crates.io/combine/4.6.6 \
    crate://crates.io/concurrent-queue/1.2.4 \
    crate://crates.io/cookie/0.16.0 \
    crate://crates.io/cookie_store/0.16.1 \
    crate://crates.io/core-foundation-sys/0.8.3 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/coreaudio-rs/0.10.0 \
    crate://crates.io/coreaudio-sys/0.2.10 \
    crate://crates.io/cpal/0.13.5 \
    crate://crates.io/cpufeatures/0.2.5 \
    crate://crates.io/crossbeam-utils/0.7.2 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/crypto-mac/0.11.1 \
    crate://crates.io/ctr/0.6.0 \
    crate://crates.io/daemonize/0.4.1 \
    crate://crates.io/darling/0.13.4 \
    crate://crates.io/darling_core/0.13.4 \
    crate://crates.io/darling_macro/0.13.4 \
    crate://crates.io/dbus-crossroads/0.4.0 \
    crate://crates.io/dbus-tokio/0.7.5 \
    crate://crates.io/dbus/0.9.6 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/digest/0.10.5 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/dirs-sys/0.3.7 \
    crate://crates.io/dirs/4.0.0 \
    crate://crates.io/enumflags2/0.6.4 \
    crate://crates.io/enumflags2_derive/0.6.4 \
    crate://crates.io/env_logger/0.7.1 \
    crate://crates.io/error-chain/0.11.0 \
    crate://crates.io/eyre/0.6.8 \
    crate://crates.io/fastrand/1.8.0 \
    crate://crates.io/fern/0.6.1 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/form_urlencoded/1.1.0 \
    crate://crates.io/fuchsia-zircon-sys/0.3.3 \
    crate://crates.io/fuchsia-zircon/0.3.3 \
    crate://crates.io/futures-channel/0.3.24 \
    crate://crates.io/futures-core/0.3.24 \
    crate://crates.io/futures-executor/0.3.24 \
    crate://crates.io/futures-io/0.3.24 \
    crate://crates.io/futures-lite/1.12.0 \
    crate://crates.io/futures-macro/0.3.24 \
    crate://crates.io/futures-sink/0.3.24 \
    crate://crates.io/futures-task/0.3.24 \
    crate://crates.io/futures-util/0.3.24 \
    crate://crates.io/futures/0.1.31 \
    crate://crates.io/futures/0.3.24 \
    crate://crates.io/gcc/0.3.55 \
    crate://crates.io/generic-array/0.14.6 \
    crate://crates.io/gethostname/0.2.3 \
    crate://crates.io/getrandom/0.2.7 \
    crate://crates.io/gimli/0.26.2 \
    crate://crates.io/glob/0.3.0 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/hkdf/0.11.0 \
    crate://crates.io/hmac/0.11.0 \
    crate://crates.io/hostname/0.3.1 \
    crate://crates.io/http-body/0.4.5 \
    crate://crates.io/http/0.2.8 \
    crate://crates.io/httparse/1.8.0 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/humantime/1.3.0 \
    crate://crates.io/hyper/0.14.20 \
    crate://crates.io/iana-time-zone/0.1.50 \
    crate://crates.io/ident_case/1.0.1 \
    crate://crates.io/idna/0.2.3 \
    crate://crates.io/idna/0.3.0 \
    crate://crates.io/if-addrs-sys/0.3.2 \
    crate://crates.io/if-addrs/0.6.7 \
    crate://crates.io/indenter/0.3.3 \
    crate://crates.io/indexmap/1.9.1 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/iovec/0.1.4 \
    crate://crates.io/itoa/1.0.3 \
    crate://crates.io/jni-sys/0.3.0 \
    crate://crates.io/jni/0.19.0 \
    crate://crates.io/jobserver/0.1.25 \
    crate://crates.io/js-sys/0.3.60 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/keyring/0.10.4 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/lewton/0.10.2 \
    crate://crates.io/libc/0.2.133 \
    crate://crates.io/libdbus-sys/0.2.2 \
    crate://crates.io/libloading/0.7.3 \
    crate://crates.io/libmdns/0.6.2 \
    crate://crates.io/libpulse-binding/2.26.0 \
    crate://crates.io/libpulse-simple-binding/2.25.0 \
    crate://crates.io/libpulse-simple-sys/1.19.2 \
    crate://crates.io/libpulse-sys/1.19.3 \
    crate://crates.io/librespot-audio/0.2.0 \
    crate://crates.io/librespot-connect/0.2.0 \
    crate://crates.io/librespot-core/0.2.0 \
    crate://crates.io/librespot-metadata/0.2.0 \
    crate://crates.io/librespot-playback/0.2.0 \
    crate://crates.io/librespot-protocol/0.2.0 \
    crate://crates.io/librespot-tremor/0.2.0 \
    crate://crates.io/lock_api/0.3.4 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/mach/0.3.2 \
    crate://crates.io/match_cfg/0.1.0 \
    crate://crates.io/matches/0.1.9 \
    crate://crates.io/maybe-async/0.2.6 \
    crate://crates.io/maybe-uninit/2.0.0 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.5.4 \
    crate://crates.io/mio/0.6.23 \
    crate://crates.io/mio/0.8.4 \
    crate://crates.io/miow/0.2.2 \
    crate://crates.io/multimap/0.8.3 \
    crate://crates.io/nb-connect/1.2.0 \
    crate://crates.io/ndk-context/0.1.1 \
    crate://crates.io/ndk-glue/0.6.2 \
    crate://crates.io/ndk-macro/0.3.0 \
    crate://crates.io/ndk-sys/0.3.0 \
    crate://crates.io/ndk/0.6.0 \
    crate://crates.io/net2/0.2.37 \
    crate://crates.io/nix/0.20.0 \
    crate://crates.io/nix/0.22.3 \
    crate://crates.io/nix/0.23.1 \
    crate://crates.io/nom/7.1.1 \
    crate://crates.io/num-bigint/0.4.3 \
    crate://crates.io/num-complex/0.4.2 \
    crate://crates.io/num-derive/0.3.3 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-iter/0.1.43 \
    crate://crates.io/num-rational/0.4.1 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num/0.4.0 \
    crate://crates.io/num_cpus/1.13.1 \
    crate://crates.io/num_enum/0.5.7 \
    crate://crates.io/num_enum_derive/0.5.7 \
    crate://crates.io/num_threads/0.1.6 \
    crate://crates.io/object/0.29.0 \
    crate://crates.io/oboe-sys/0.4.5 \
    crate://crates.io/oboe/0.4.6 \
    crate://crates.io/ogg-sys/0.0.9 \
    crate://crates.io/ogg/0.8.0 \
    crate://crates.io/once_cell/1.15.0 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/owo-colors/1.3.0 \
    crate://crates.io/parking/2.0.0 \
    crate://crates.io/parking_lot/0.11.2 \
    crate://crates.io/parking_lot/0.9.0 \
    crate://crates.io/parking_lot_core/0.6.2 \
    crate://crates.io/parking_lot_core/0.8.5 \
    crate://crates.io/pbkdf2/0.8.0 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/percent-encoding/2.2.0 \
    crate://crates.io/pin-project-lite/0.1.12 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.25 \
    crate://crates.io/polling/2.3.0 \
    crate://crates.io/portaudio-rs/0.3.2 \
    crate://crates.io/portaudio-sys/0.1.1 \
    crate://crates.io/ppv-lite86/0.2.16 \
    crate://crates.io/priority-queue/1.2.3 \
    crate://crates.io/proc-macro-crate/0.1.5 \
    crate://crates.io/proc-macro-crate/1.2.1 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.44 \
    crate://crates.io/protobuf-codegen-pure/2.14.0 \
    crate://crates.io/protobuf-codegen/2.14.0 \
    crate://crates.io/protobuf/2.14.0 \
    crate://crates.io/psl-types/2.0.11 \
    crate://crates.io/publicsuffix/2.2.2 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/quote/1.0.21 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/redox_syscall/0.1.57 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/regex-syntax/0.6.27 \
    crate://crates.io/regex/1.6.0 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/ring/0.16.20 \
    crate://crates.io/rodio/0.13.1 \
    crate://crates.io/rspotify-http/0.11.5 \
    crate://crates.io/rspotify-macros/0.11.5 \
    crate://crates.io/rspotify-model/0.11.5 \
    crate://crates.io/rspotify/0.11.5 \
    crate://crates.io/rustc-demangle/0.1.21 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustc-serialize/0.3.24 \
    crate://crates.io/rustc_version/0.2.3 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustls/0.20.6 \
    crate://crates.io/rustversion/1.0.9 \
    crate://crates.io/ryu/1.0.11 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scoped-tls/1.0.0 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/sct/0.7.0 \
    crate://crates.io/secret-service/2.0.2 \
    crate://crates.io/security-framework-sys/2.6.1 \
    crate://crates.io/security-framework/2.7.0 \
    crate://crates.io/semver-parser/0.7.0 \
    crate://crates.io/semver/0.9.0 \
    crate://crates.io/semver/1.0.14 \
    crate://crates.io/serde/1.0.145 \
    crate://crates.io/serde_derive/1.0.145 \
    crate://crates.io/serde_json/1.0.85 \
    crate://crates.io/serde_repr/0.1.9 \
    crate://crates.io/sha-1/0.9.8 \
    crate://crates.io/sha2/0.10.6 \
    crate://crates.io/sha2/0.9.9 \
    crate://crates.io/shannon/0.2.0 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/shell-words/1.1.0 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/signal-hook-registry/1.4.0 \
    crate://crates.io/slab/0.4.7 \
    crate://crates.io/smallvec/0.6.14 \
    crate://crates.io/smallvec/1.9.0 \
    crate://crates.io/socket2/0.4.7 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/stdweb/0.1.3 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/structopt-derive/0.4.18 \
    crate://crates.io/structopt/0.3.26 \
    crate://crates.io/strum/0.24.1 \
    crate://crates.io/strum_macros/0.24.3 \
    crate://crates.io/subtle/2.4.1 \
    crate://crates.io/syn/1.0.100 \
    crate://crates.io/synstructure/0.12.6 \
    crate://crates.io/syslog/4.0.1 \
    crate://crates.io/tempfile/3.3.0 \
    crate://crates.io/termcolor/1.1.3 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/thiserror-impl/1.0.36 \
    crate://crates.io/thiserror/1.0.36 \
    crate://crates.io/thread_local/1.1.4 \
    crate://crates.io/time-macros/0.2.4 \
    crate://crates.io/time/0.1.44 \
    crate://crates.io/time/0.3.14 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.0 \
    crate://crates.io/tokio-compat-02/0.2.0 \
    crate://crates.io/tokio-compat/0.1.6 \
    crate://crates.io/tokio-current-thread/0.1.7 \
    crate://crates.io/tokio-executor/0.1.10 \
    crate://crates.io/tokio-io/0.1.13 \
    crate://crates.io/tokio-macros/1.8.0 \
    crate://crates.io/tokio-reactor/0.1.12 \
    crate://crates.io/tokio-stream/0.1.10 \
    crate://crates.io/tokio-sync/0.1.8 \
    crate://crates.io/tokio-timer/0.2.13 \
    crate://crates.io/tokio-util/0.6.10 \
    crate://crates.io/tokio/0.2.25 \
    crate://crates.io/tokio/1.21.1 \
    crate://crates.io/toml/0.5.9 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tracing-attributes/0.1.22 \
    crate://crates.io/tracing-core/0.1.29 \
    crate://crates.io/tracing-error/0.1.2 \
    crate://crates.io/tracing-subscriber/0.2.25 \
    crate://crates.io/tracing/0.1.36 \
    crate://crates.io/try-lock/0.2.3 \
    crate://crates.io/typenum/1.15.0 \
    crate://crates.io/unicode-bidi/0.3.8 \
    crate://crates.io/unicode-ident/1.0.4 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-segmentation/1.10.0 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/ureq/2.5.0 \
    crate://crates.io/url/2.3.1 \
    crate://crates.io/uuid/0.8.2 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/vergen/3.2.0 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/waker-fn/1.1.0 \
    crate://crates.io/walkdir/2.3.2 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.83 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.83 \
    crate://crates.io/wasm-bindgen-macro/0.2.83 \
    crate://crates.io/wasm-bindgen-shared/0.2.83 \
    crate://crates.io/wasm-bindgen/0.2.83 \
    crate://crates.io/web-sys/0.3.60 \
    crate://crates.io/webpki-roots/0.22.5 \
    crate://crates.io/webpki/0.22.0 \
    crate://crates.io/wepoll-ffi/0.1.2 \
    crate://crates.io/whoami/0.9.0 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.36.1 \
    crate://crates.io/windows_aarch64_msvc/0.36.1 \
    crate://crates.io/windows_i686_gnu/0.36.1 \
    crate://crates.io/windows_i686_msvc/0.36.1 \
    crate://crates.io/windows_x86_64_gnu/0.36.1 \
    crate://crates.io/windows_x86_64_msvc/0.36.1 \
    crate://crates.io/ws2_32-sys/0.2.1 \
    crate://crates.io/xdg/2.4.1 \
    crate://crates.io/zbus/1.9.3 \
    crate://crates.io/zbus_macros/1.9.3 \
    crate://crates.io/zerocopy-derive/0.2.0 \
    crate://crates.io/zerocopy/0.3.0 \
    crate://crates.io/zvariant/2.10.0 \
    crate://crates.io/zvariant_derive/2.10.0 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d \
"

SUMMARY = "A Spotify daemon"
HOMEPAGE = "https://github.com/Spotifyd/spotifyd"
LICENSE = "GPL-3.0-only"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include spotifyd-${PV}.inc
include spotifyd.inc

################################

SRC_URI += "file://spotifyd.conf"

do_install_append() {
  install -d ${D}${sysconfdir}
  install -m 0755 ${WORKDIR}/spotifyd.conf ${D}${sysconfdir}

}

FILES_${PN} += "${sysconfdir}"
