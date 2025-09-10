package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqf implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final /* synthetic */ int f;

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i) {
        this.f = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.f) {
            case 0:
                out outVar = (out) this.a.a();
                tzx tzxVar = this.e;
                tzx tzxVar2 = this.c;
                Activity activityA = ((imn) this.b).a();
                jgt jgtVarA = ((iyb) tzxVar2).a();
                pbn pbnVar = (pbn) tzxVar.a();
                tzx tzxVar3 = this.d;
                try {
                    pbnVar.f("secure");
                    return lqe.a(activityA.getIntent()) ? new kue(new lqd(tzxVar3, outVar, jgtVarA, 0), 2) : hgd.a;
                } finally {
                    pbnVar.g();
                }
            case 1:
                return new lpm((hbj) this.b.a(), (fqg) this.a.a(), (hem) this.d.a(), (Executor) this.c.a(), (pbn) this.e.a());
            case 2:
                return new lqg(((ixw) this.c).a(), (owq) this.b.a(), (owf) this.a.a(), (out) this.d.a(), (lqo) this.e.a());
            case 3:
                return new lrb((fvu) this.b.a(), (qqq) this.e.a(), ((ngz) this.d).a(), (mwq) this.c.a(), (hbj) this.a.a());
            case 4:
                return new lsa(((lrq) this.b).a(), (qqq) this.d.a(), (hbj) this.a.a(), (mdy) this.e.a(), (Executor) this.c.a());
            case 5:
                return new qqq(((ppk) this.a).a(), (pbn) this.e.a(), (luj) this.d.a(), (ppu) this.b.a(), (ocq) ((tzu) this.c).a);
            case 6:
                lwm lwmVar = (lwm) this.e.a();
                out outVar2 = (out) this.b.a();
                return new lwo(lwmVar, this.c, this.a, this.d, outVar2);
            case 7:
                owf owfVar = (owf) this.a.a();
                owf owfVar2 = (owf) this.e.a();
                lww lwwVar = (lww) this.d.a();
                fqg fqgVar = (fqg) this.c.a();
                Executor executor = (Executor) this.b.a();
                ovx ovxVar = new ovx(false);
                fqgVar.b.d(owfVar.dK(new fcd(owfVar2, ovxVar, lwwVar, 11, (char[]) null), executor));
                return ovxVar;
            case 8:
                tzx tzxVar4 = this.a;
                tzx tzxVar5 = this.c;
                tzj tzjVarB = tzs.b(this.b);
                tzj tzjVarB2 = tzs.b(tzxVar5);
                Object sfmVar = ((lww) tzxVar4.a()).a ? new sfm(new frf(new iff(tzs.b(this.d), tzjVarB, tzjVarB2, (luj) this.e.a(), 6), "skyla", 0)) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 9:
                return new lwy(((kiv) this.a).a(), (juv) this.b.a(), (owq) this.e.a(), (owf) this.c.a(), (nmt) this.d.a());
            case 10:
                ((hfg) this.c).a();
                our ourVar = (our) this.d.a();
                pit pitVar = (pit) this.e.a();
                pfu pfuVar = (pfu) this.b.a();
                rwc rwcVar = (rwc) this.a.a();
                iso.p();
                Object sfmVar2 = !rwcVar.h() ? sfd.a : new sfm(new frf(new iff(pfuVar, rwcVar, pitVar, ourVar, 7), "pcksmarts", 0));
                sfmVar2.getClass();
                return sfmVar2;
            case 11:
                return new lzp(((lzr) this.a).b(), (owf) this.b.a(), (mdy) this.d.a(), (owf) this.e.a(), (owf) this.c.a());
            case 12:
                fqg fqgVar2 = (fqg) this.b.a();
                mbq mbqVar = new mbq(((imm) this.c).b(), (owf) this.e.a(), this.d, (Executor) this.a.a());
                fqgVar2.b.d(mbqVar);
                return mbqVar;
            case 13:
                fqg fqgVar3 = (fqg) this.b.a();
                mbq mbqVar2 = new mbq(((imm) this.c).b(), (owf) this.e.a(), this.d, (Executor) this.a.a());
                fqgVar3.b.d(mbqVar2);
                return mbqVar2;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fqg fqgVar4 = (fqg) this.b.a();
                mbq mbqVar3 = new mbq(((imm) this.c).b(), (owf) this.e.a(), this.d, (Executor) this.a.a());
                fqgVar4.b.d(mbqVar3);
                return mbqVar3;
            case 15:
                return new mdi((mdy) this.e.a(), (pbn) this.d.a(), (cxb) this.a.a(), (hbj) this.b.a(), (owf) this.c.a());
            case 16:
                return new mgt((owq) this.e.a(), (owq) this.c.a(), ((mhb) this.d).a(), ((kif) this.b).a(), (our) this.a.a());
            case 17:
                return new mgz((Context) this.b.a(), (hbj) this.d.a(), (mni) this.c.a(), (pnq) this.a.a(), (owq) this.e.a());
            case 18:
                mdy mdyVar = (mdy) this.e.a();
                tzx tzxVar6 = this.a;
                tzx tzxVar7 = this.c;
                Object objA = this.d.a();
                jgj jgjVarA = ((jgo) tzxVar7).a();
                out outVar3 = (out) tzxVar6.a();
                return new mhn(mdyVar, (mhm) objA, jgjVarA, outVar3);
            case 19:
                our ourVar2 = (our) this.a.a();
                tzx tzxVar8 = this.b;
                rwc rwcVarB = ((lzr) this.c).b();
                mmb mmbVar = (mmb) tzxVar8.a();
                tzx tzxVar9 = this.d;
                rwc rwcVarB2 = ((ixr) this.e).b();
                owf owfVar3 = (owf) tzxVar9.a();
                rnt.s(rwcVarB.h());
                mlx mlxVarV = ((gox) rwcVarB.c()).v(rwc.j(mmbVar), mmj.a(rwcVarB2), owfVar3, false);
                ourVar2.d(mlxVarV);
                return mlxVarV;
            default:
                return new mmd((hws) this.b.a(), (owf) this.c.a(), (hpj) this.d.a(), (hpa) this.a.a(), (pbn) this.e.a());
        }
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[] bArr) {
        this.f = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[] cArr) {
        this.f = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[] cArr, byte[] bArr) {
        this.f = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[] fArr) {
        this.f = i;
        this.e = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.b = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[] iArr) {
        this.f = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[] sArr) {
        this.f = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.a = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[] zArr) {
        this.f = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.c = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[][] bArr) {
        this.f = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.b = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[][] cArr) {
        this.f = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[][] fArr) {
        this.f = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.d = tzxVar4;
        this.a = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[][] iArr) {
        this.f = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.e = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[][] sArr) {
        this.f = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[][][] fArr) {
        this.f = i;
        this.e = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
        this.b = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[][][] iArr) {
        this.f = i;
        this.e = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[][][] sArr) {
        this.f = i;
        this.e = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
        this.c = tzxVar5;
    }

    public lqf(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[][][] zArr) {
        this.f = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
    }
}
