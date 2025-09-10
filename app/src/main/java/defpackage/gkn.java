package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gkn implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final /* synthetic */ int e;

    public gkn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.e) {
            case 0:
                tzx tzxVar = this.d;
                final gaw gawVarB = ((ggc) this.a).b();
                final our ourVar = (our) tzxVar.a();
                final tzx tzxVar2 = this.c;
                final tzx tzxVar3 = this.b;
                return new fre() { // from class: gki
                    @Override // defpackage.fre
                    public final /* synthetic */ int a() {
                        return 0;
                    }

                    @Override // defpackage.fre
                    public final syu b() {
                        if (gawVarB.F) {
                            uem uemVar = tzxVar3;
                            gkq gkqVar = (gkq) uemVar.a();
                            synchronized (gkqVar.b) {
                                gkqVar.c = ojl.bZ("cc-frame-qual-scorer");
                            }
                            uem uemVar2 = tzxVar2;
                            our ourVar2 = ourVar;
                            gkqVar.a.d(new gge(gkqVar, 4));
                            ourVar2.d(((gks) uemVar2.a()).a((gkq) uemVar.a()));
                        }
                        return ske.M(true);
                    }

                    @Override // defpackage.fre
                    public final /* synthetic */ String c() {
                        return gsn.Z(this);
                    }
                };
            case 1:
                ((imm) this.a).b();
                ((hfl) this.c).a();
                hbj hbjVar = (hbj) this.b.a();
                return new ggg(hbjVar);
            case 2:
                return new hud((iso) this.c.a(), (htv) this.a.a(), ((hxw) this.b).a(), (hbj) this.d.a());
            case 3:
                return new ikh((ijr) this.c.a(), (ija) this.a.a(), (ijj) this.b.a(), ((imm) this.d).b());
            case 4:
                return new ikp(((pab) this.d).a(), (hbj) this.a.a(), (jwj) this.c.a(), (jwh) this.b.a());
            case 5:
                Object sfmVar = ((hbj) this.d.a()).p(hab.d) ? new sfm(new frf(new gdq((Object) ((knz) this.b).a(), (Object) this.a, this.c.a(), 10, (short[]) null), "moblur", 0)) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 6:
                Map map = (Map) this.b.a();
                rwc rwcVar = (rwc) this.d.a();
                lkk lkkVar = (lkk) this.a.a();
                return new jlv(map, rwcVar, lkkVar);
            case 7:
                oxj oxjVarA = jea.A((gnt) this.d.a(), (hbj) this.a.a(), ((ggu) this.b).a(), (qqq) this.c.a());
                oxjVarA.getClass();
                return oxjVarA;
            case 8:
                return new gga((owf) this.a.a(), (our) this.c.a(), (Executor) this.d.a(), (ScheduledExecutorService) this.b.a());
            case 9:
                tzx tzxVar4 = this.a;
                tzx tzxVar5 = this.c;
                tzj tzjVarB = tzs.b(tzxVar4);
                tzs.b(tzxVar5);
                ((Boolean) this.d.a()).booleanValue();
                int i = kok.a;
                kmz kmzVar = (kmz) tzjVarB.a();
                kmzVar.getClass();
                return kmzVar;
            case 10:
                return ((hbj) this.a.a()).p(gyp.k) ? new frf(new lqd((Object) ((hfg) this.d).a(), this.c.a(), (Object) ((kiu) this.b).a(), 6, (char[]) null), "smarts", 0) : frh.a;
            default:
                return new miq((owq) this.b.a(), (hbj) this.d.a(), (out) this.a.a(), (mky) this.c.a());
        }
    }

    public gkn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
    }

    public gkn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[] cArr) {
        this.e = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
    }

    public gkn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[] fArr) {
        this.e = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
    }

    public gkn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[] iArr) {
        this.e = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public gkn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
    }

    public gkn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[][] bArr) {
        this.e = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
    }

    public gkn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[][] cArr) {
        this.e = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
    }

    public gkn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[][] iArr) {
        this.e = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
    }

    public gkn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, short[][] sArr) {
        this.e = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }
}
