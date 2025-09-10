package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uzo implements tpk {
    UNKNOWN(0),
    CREDENTIAL_ENCRYPTED(1),
    DEVICE_ENCRYPTED(2);

    public final int d;

    uzo(int i) {
        this.d = i;
    }

    @Override // defpackage.tpk
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
