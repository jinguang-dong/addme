package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum pgl {
    SESSION_BLOCKLIST("Session blocklist"),
    DEVICE_BLOCKLIST("Device blocklist"),
    API_BLOCKLIST("Api blocklist"),
    AAA_BLOCKLIST("Please use 3A methods exposed via frameserver for this operation"),
    UNSUPPORTED_KEY("Unsupported key");

    public final String f;

    pgl(String str) {
        this.f = str;
    }
}
