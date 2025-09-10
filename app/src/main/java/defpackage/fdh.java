package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.ar.core.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdh implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final /* synthetic */ int f;

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i) {
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
                return new fdg((cxb) this.a.a(), (hbj) this.b.a(), ((imm) this.c).b(), (feb) this.d.a(), (out) this.e.a());
            case 1:
                return new fbx((our) this.a.a(), (hwt) this.b.a(), ((kiu) this.d).a(), (Executor) this.c.a(), ((pba) this.e).a());
            case 2:
                return new hrj(((ixw) this.d).a(), (owf) this.c.a(), (owq) this.e.a(), (owf) this.a.a(), (out) this.b.a());
            case 3:
                tzx tzxVar = this.e;
                tzx tzxVar2 = this.d;
                tzx tzxVar3 = this.a;
                final Context contextB = ((imm) this.c).b();
                final ocq ocqVarA = ((ngy) tzxVar3).a();
                final tzj tzjVarB = tzs.b(tzxVar2);
                final szh szhVar = (szh) tzxVar.a();
                return !((hbj) this.b.a()).o(gyi.h) ? new nkm() { // from class: fhk
                    @Override // defpackage.nkm
                    public final void a() {
                        szhVar.a(new IllegalStateException("Cottage is not enabled!"));
                    }
                } : new nkm() { // from class: fhl
                    @Override // defpackage.nkm
                    public final void a() {
                        ocq ocqVar = ocqVarA;
                        ViewStub viewStub = (ViewStub) ocqVar.c(R.id.cottage_preview_overlay_stub);
                        viewStub.setLayoutResource(R.layout.cottage_preview_overlay);
                        View viewInflate = viewStub.inflate();
                        View viewInflate2 = LayoutInflater.from(contextB).inflate(R.layout.cottage_preview_content, (ViewGroup) null);
                        fjc fjcVar = (fjc) tzjVarB.a();
                        fjcVar.a = viewInflate;
                        fjcVar.b = viewInflate2.findViewById(R.id.overlay_text);
                        FrameLayout frameLayout = (FrameLayout) fjcVar.f.c(R.id.viewfinder_frame);
                        fjcVar.c = new PopupWindow(viewInflate2, frameLayout.getWidth(), frameLayout.getHeight(), true);
                        fjcVar.d = frameLayout;
                        ViewStub viewStub2 = (ViewStub) ocqVar.c(R.id.cottage_chip_stub);
                        viewStub2.setLayoutResource(R.layout.allin_notification_chip_layout);
                        szhVar.e(viewStub2.inflate());
                    }
                };
            case 4:
                syu syuVar = (syu) this.e.a();
                out outVar = (out) this.c.a();
                tzx tzxVar4 = this.b;
                jgt jgtVarA = ((ixv) this.d).a();
                fks fksVar = (fks) tzxVar4.a();
                hbj hbjVar = (hbj) this.a.a();
                sgv sgvVar = fkg.a;
                return !hbjVar.o(gyi.h) ? new fhm(2) : new fpb(syuVar, fksVar, jgtVarA, outVar, 1);
            case 5:
                fkw fkwVar = (fkw) ((tzu) this.c).a;
                fkw fkwVar2 = (fkw) ((tzu) this.d).a;
                int i = sbp.d;
                sbk sbkVar = new sbk();
                sbkVar.h(fkwVar);
                sbkVar.h(fkwVar2);
                gzi gziVar = gyi.a;
                sbp sbpVarG = sbkVar.g();
                sbpVarG.getClass();
                return sbpVarG;
            case 6:
                AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) this.b.a();
                tzx tzxVar5 = this.d;
                tzx tzxVar6 = this.c;
                return new gtd((hbj) this.a.a(), (ocq) this.e.a(), ((luj) tzxVar6.a()).a(luf.u), ambientController, tzs.b(tzxVar5), 1);
            case 7:
                syu syuVar2 = (syu) this.b.a();
                out outVar2 = (out) this.c.a();
                tzx tzxVar7 = this.a;
                tzx tzxVar8 = this.e;
                return !((hbj) tzxVar7.a()).o(gyi.h) ? new fhm(3) : new fpb(syuVar2, ((fpm) tzxVar8).a(), ((ixv) this.d).a(), outVar2, 0);
            case 8:
                return new fpv(this.c, (out) this.b.a(), ((iyb) this.d).a(), (CameraActivityTiming) this.a.a(), (pbn) this.e.a());
            case 9:
                return new jht(((ixw) this.d).a(), (owq) this.a.a(), (fuf) this.e.a(), (hyh) this.c.a(), (out) this.b.a(), 1);
            case 10:
                fut futVar = (fut) this.e.a();
                iso isoVar = (iso) this.c.a();
                Object sfmVar = !((hbj) this.a.a()).p(gyj.a) ? sfd.a : new sfm(new gtr((pfl) this.b.a(), futVar, isoVar, ((ixw) this.d).a(), 1));
                sfmVar.getClass();
                return sfmVar;
            case 11:
                return new frf(new iax((hbj) this.a.a(), ((kiu) this.b).a(), (rwc) this.e.a(), ((ful) this.d).a(), (our) this.c.a(), 1), "autotimer", 0);
            case 12:
                return new qqq(((imm) this.a).b(), (luw) this.e.a(), ((ggu) this.b).a(), (hbj) this.c.a(), (jug) this.d.a());
            case 13:
                krj krjVar = (krj) this.c.a();
                ((imm) this.d).b();
                return new gkz(krjVar, (luj) this.b.a(), (luj) this.e.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new gmy((mni) this.d.a(), ((imm) this.a).b(), (mwq) this.c.a(), ((fry) this.b).b(), (ScheduledExecutorService) this.e.a());
            case 15:
                return new qqq((lqc) this.c.a(), (out) this.e.a(), (iso) this.a.a(), ((imm) this.d).b(), (gsk) this.b.a());
            case 16:
                out outVar3 = (out) this.b.a();
                tzx tzxVar9 = this.c;
                tzj tzjVarB2 = tzs.b(this.e);
                Object sfmVar2 = (((gps) this.a.a()).c() && gsn.m((hbj) tzxVar9.a())) ? new sfm(new gpu(((ixw) this.d).a(), tzjVarB2, outVar3, 0)) : sfd.a;
                sfmVar2.getClass();
                return sfmVar2;
            case 17:
                return new gqg(((imm) this.c).b(), (iso) this.d.a(), (gpn) this.a.a(), new pql(), (grj) this.e.a(), (hbj) this.b.a());
            case 18:
                return new gqx(((lzr) this.b).b(), (gsh) this.d.a(), (Executor) this.a.a(), (gqq) this.c.a(), (grd) this.e.a());
            case 19:
                Object objA = this.d.a();
                return new gri((gqg) objA, new cxb((char[]) null, (byte[]) null), ((gql) this.c).a(), (pbs) this.b.a(), ((imm) this.a).b(), (pbn) this.e.a());
            default:
                Object sfmVar3 = ((gps) this.d.a()).c() ? new sfm(new fpb(((gtc) this.c).a(), (AmbientMode.AmbientController) this.e.a(), this.a, (out) this.b.a(), 3)) : sfd.a;
                sfmVar3.getClass();
                return sfmVar3;
        }
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[] bArr) {
        this.f = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[] cArr) {
        this.f = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.a = tzxVar4;
        this.b = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[] cArr, byte[] bArr) {
        this.f = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
        this.c = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[] fArr) {
        this.f = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[] iArr) {
        this.f = i;
        this.e = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.a = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[] sArr) {
        this.f = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[] zArr) {
        this.f = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[][] bArr) {
        this.f = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.e = tzxVar4;
        this.a = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[][] cArr) {
        this.f = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[][] iArr) {
        this.f = i;
        this.e = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
        this.d = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[][] sArr) {
        this.f = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.e = tzxVar4;
        this.d = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.e = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[][][] cArr) {
        this.f = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
        this.e = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[][][] fArr) {
        this.f = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[][][] iArr) {
        this.f = i;
        this.b = tzxVar;
        this.e = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.a = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[][][] sArr) {
        this.f = i;
        this.c = tzxVar;
        this.e = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
        this.b = tzxVar5;
    }

    public fdh(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[][][] zArr) {
        this.f = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.e = tzxVar4;
        this.b = tzxVar5;
    }
}
