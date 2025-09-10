package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pul extends Exception {
    public final puk a;
    public final int b;

    public pul(tfm tfmVar) {
        super((String) tfmVar.c, (Throwable) tfmVar.d);
        this.a = (puk) tfmVar.b;
        this.b = tfmVar.a;
    }

    public static tfm a() {
        tfm tfmVar = new tfm((char[]) null);
        tfmVar.a = 2;
        return tfmVar;
    }
}
