package defpackage;

import com.google.googlex.gcam.creativecamera.allin.jni.AllInNativeImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class teh implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final /* synthetic */ int h;

    public teh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i) {
        this.h = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        if (this.h == 0) {
            AllInNativeImpl allInNativeImpl = new AllInNativeImpl();
            tzx tzxVar = this.f;
            tzx tzxVar2 = this.e;
            tzx tzxVar3 = this.d;
            tzx tzxVar4 = this.c;
            return new teg(allInNativeImpl, ((tgb) this.a).a(), ((tep) this.b).a(), ((tet) tzxVar4).a(), ((tdz) tzxVar3).a(), ((tfl) tzxVar2).a(), (syw) tzxVar.a(), (owf) this.g.a());
        }
        tzx tzxVar5 = this.d;
        qqq qqqVarA = ((qqr) this.g).a();
        syx syxVar = (syx) tzxVar5.a();
        tzs.b(this.f);
        tzx tzxVar6 = this.a;
        tzx tzxVar7 = this.e;
        tzj tzjVarB = tzs.b(this.c);
        qpf qpfVarA = ((qvm) tzxVar7).a();
        ((qvq) tzxVar6).a();
        return new qvf(qqqVarA, syxVar, tzjVarB, this.b, qpfVarA);
    }

    public teh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, int i, byte[] bArr) {
        this.h = i;
        this.g = tzxVar;
        this.d = tzxVar2;
        this.f = tzxVar3;
        this.c = tzxVar4;
        this.b = tzxVar5;
        this.e = tzxVar6;
        this.a = tzxVar7;
    }
}
