package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxh implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final /* synthetic */ int e;

    public lxh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        return this.e != 0 ? b() : b();
    }

    public final owf b() {
        if (this.e == 0) {
            owf owfVarG = owl.g((owf) this.a.a(), owl.h((owf) this.b.a(), new iaz(((imp) this.c).a(), ((imm) this.d).b(), 6, null)));
            owfVarG.getClass();
            return owfVarG;
        }
        owq owqVar = (owq) this.b.a();
        boolean zBooleanValue = ((Boolean) this.a.a()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.d.a()).booleanValue();
        gzi gziVar = gyw.a;
        owf owfVarH = owl.h(owqVar, new hjz(zBooleanValue, zBooleanValue2, 1));
        owfVarH.getClass();
        return owfVarH;
    }

    public lxh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr) {
        this.e = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
    }
}
