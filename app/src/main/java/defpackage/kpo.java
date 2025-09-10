package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpo implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;

    public kpo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rww a() {
        hbj hbjVar = (hbj) this.a.a();
        mhq mhqVar = (mhq) this.b.a();
        mhp mhpVarB = ((mia) this.c).b();
        our ourVar = (our) this.d.a();
        ibb ibbVar = (ibb) this.e.a();
        int iIntValue = ((Integer) hbjVar.a(hae.f).get()).intValue();
        Integer num = (Integer) hbjVar.a(hae.g).get();
        int iIntValue2 = num.intValue();
        int iIntValue3 = ((Integer) hbjVar.a(hae.h).get()).intValue();
        ovx ovxVar = new ovx(num);
        gok gokVar = new gok(ovxVar, 16);
        mhs mhsVar = new mhs();
        mhsVar.d("SmartMeteringExtendedPeriod");
        mhsVar.c(sxo.a);
        mhsVar.g(mhpVarB);
        mhsVar.f(new kpl(gokVar, iIntValue2, 1));
        mhsVar.e(new kpl(gokVar, iIntValue3, 0));
        ourVar.d(mhqVar.d(mhsVar.a()));
        return new kpm(ibbVar, ovxVar, iIntValue, 0);
    }
}
