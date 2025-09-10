package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfi {
    public int a;

    public bfi() {
        this((char[]) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        String string = Integer.toString(hashCode(), 16);
        string.getClass();
        sb.append(string);
        return sb.toString();
    }

    public bfi(byte[] bArr) {
        this.a = 0;
    }

    public /* synthetic */ bfi(char[] cArr) {
        this((byte[]) null);
    }
}
