package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmd {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public jmd() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public jmd(jmc jmcVar) {
        float f = (jmcVar.c * 360.0f) / jmcVar.e;
        this.a = jmcVar.b && !jmcVar.g && (f >= 70.0f || (((float) jmcVar.d) * 180.0f) / ((float) jmcVar.f) >= 70.0f);
        this.b = !jmcVar.g && f == 360.0f;
        this.c = jmcVar.h;
    }
}
