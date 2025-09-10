package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvx implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public mvx(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new mwb((lrh) this.a.a());
            case 1:
                return new mva(((imm) this.a).b());
            case 2:
                owq owqVar = (owq) ((sbv) this.a.a()).get(mxk.DEFAULT);
                owqVar.getClass();
                return owqVar;
            case 3:
                owq owqVar2 = (owq) ((sbv) this.a.a()).get(mxk.DEVICE);
                owqVar2.getClass();
                return owqVar2;
            case 4:
                owq owqVar3 = (owq) ((sbv) this.a.a()).get(mxk.DEFAULT);
                owqVar3.getClass();
                return owqVar3;
            case 5:
                owq owqVar4 = (owq) ((sbv) this.a.a()).get(mxk.TO_LEFT);
                owqVar4.getClass();
                return owqVar4;
            case 6:
                owf owfVarA = owb.a((owq) this.a.a());
                owfVarA.getClass();
                return owfVarA;
            case 7:
                owf owfVarA2 = owb.a((owq) this.a.a());
                owfVarA2.getClass();
                return owfVarA2;
            case 8:
                return new mye(((imn) this.a).a());
            case 9:
                return new ocq((mwq) this.a.a());
            case 10:
                pbn pbnVar = (pbn) this.a.a();
                szh szhVar = new szh();
                szhVar.c(new mub(pbnVar.a("Viewfinder"), 20), sxo.a);
                return szhVar;
            case 11:
                return new qpt((qpt) this.a.a());
            case 12:
                qqq qqqVar = (qqq) this.a.a();
                qqqVar.getClass();
                return qqqVar;
            case 13:
                return ((ngx) this.a).a().e;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new mwq((ocq) ((ngx) this.a).a().j);
            case 15:
                return ((ngx) this.a).a().i;
            case 16:
                return ((ngx) this.a).a().e;
            case 17:
                owq owqVar5 = (owq) this.a.a();
                owqVar5.getClass();
                return owqVar5;
            case 18:
                return ((luj) this.a.a()).a(luf.ag);
            case 19:
                return new nkc(((gad) this.a).b());
            default:
                return new ovx(((nkv) this.a).a());
        }
    }
}
