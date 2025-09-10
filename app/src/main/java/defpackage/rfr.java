package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfr extends Exception {
    public final int a;

    private rfr(int i, String str) {
        super(str);
        this.a = i;
    }

    public static rfr a(int i, String str, Object... objArr) {
        return new rfr(i, String.format("Reason: %s. Additional details: %s", i != 1 ? i != 2 ? i != 3 ? "PASSWORD_LENGTH_INVALID" : "SECURE_NETWORK_BUT_MISSING_PASSWORD" : "OPEN_NETWORK_HAS_PASSWORD" : "SSID_LENGTH_INVALID", String.format(str, objArr)));
    }
}
