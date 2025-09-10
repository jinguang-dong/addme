package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dny implements apv {
    private final apv a;
    private final apv b;
    private final uif c;

    public dny(apv apvVar, apv apvVar2, uif uifVar) {
        this.a = apvVar;
        this.b = apvVar2;
        this.c = uifVar;
    }

    @Override // defpackage.apv
    public final float a(long j, chq chqVar) {
        uif uifVar = this.c;
        return chp.x(this.a.a(j, chqVar), this.b.a(j, chqVar), ((Number) uifVar.a()).floatValue());
    }
}
