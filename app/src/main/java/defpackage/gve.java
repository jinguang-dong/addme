package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gve implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public gve(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    /* JADX WARN: Type inference failed for: r4v69, types: [java.lang.Object, tzj] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                hbj hbjVar = (hbj) this.a.a();
                ocq ocqVarA = ((ngy) this.b).a();
                hbjVar.getClass();
                return hbjVar.p(hba.u) ? new jjy(ocqVarA, 1) : new gnc(2);
            case 1:
                return new iso(((imm) this.a).b(), (mni) this.b.a(), (byte[]) null);
            case 2:
                return new hcb(((imm) this.b).b(), (hbj) this.a.a());
            case 3:
                tzs.b(this.a);
                return new gsn((short[]) null);
            case 4:
                gzi gziVar = gzo.a;
                return new hgc();
            case 5:
                return new cxb((hbj) this.b.a());
            case 6:
                gzi gziVar2 = gzs.a;
                return hgd.a;
            case 7:
                return ((hbj) this.b.a()).p(gzo.aF) ? ((hec) this.a).a() : new hek();
            case 8:
                hbj hbjVar2 = (hbj) this.a.a();
                return new hfn(hbjVar2);
            case 9:
                gzi gziVar3 = hba.a;
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            case 10:
                int i = gyu.a;
                return new owi(false);
            case 11:
                return !((Boolean) ((owf) this.a.a()).dL()).booleanValue() ? rwc.j(new ezh((byte[]) null)) : (rwc) ((tzu) this.b).a;
            case 12:
                tzx tzxVar = this.a;
                fdq fdqVarA = ((ixw) this.b).a();
                hie hieVarA = ((hif) tzxVar).a();
                fdqVarA.j().d(hieVarA);
                return hieVarA;
            case 13:
                return new gpu((pbn) this.a.a(), "fb", this.b, 4);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new lir((pbn) this.a.a(), tzs.b(this.b), 1);
            case 15:
                return new hkf(((lxh) this.b).b(), (Executor) this.a.a());
            case 16:
                hbj hbjVar3 = (hbj) this.a.a();
                Object hkjVar = (!hbjVar3.p(gyx.b) || rnt.V(hbjVar3.f(gyx.h))) ? new hkj() : (hkl) ((rwg) ((jaf) this.b).b()).a.a();
                hkjVar.getClass();
                return hkjVar;
            case 17:
                pfu pfuVar = (pfu) this.a.a();
                rwc rwcVar = (rwc) this.b.a();
                return rwcVar.h() ? rwc.j(pfuVar.d((peo) rwcVar.c())) : rvk.a;
            case 18:
                return rwc.i(((pfu) this.b.a()).a.b((peq) this.a.a()));
            case 19:
                return hgc.d(new lpt(1), (hms) this.a.a(), ((hmn) this.b).b());
            default:
                return hgc.d(new lpt(0), (hms) this.a.a(), ((hmn) this.b).b());
        }
    }

    public gve(tzx tzxVar, tzx tzxVar2, int i, char[] cArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
