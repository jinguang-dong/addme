package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpz implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;

    public gpz(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gre a() {
        gre greVar;
        tzj tzjVarB = tzs.b(this.a);
        tzj tzjVarB2 = tzs.b(this.b);
        grd grdVar = (grd) this.c.a();
        hbj hbjVar = (hbj) this.d.a();
        fdq fdqVarA = ((ixw) this.e).a();
        if (gsn.m(hbjVar)) {
            gqx gqxVar = (gqx) tzjVarB2.a();
            our ourVarJ = fdqVarA.j();
            grdVar.a = gqxVar;
            ourVarJ.d(new ffy(grdVar, 11));
            greVar = gqxVar;
        } else {
            greVar = (gre) tzjVarB.a();
        }
        greVar.getClass();
        return greVar;
    }
}
