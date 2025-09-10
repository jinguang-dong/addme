package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.material.button.MaterialButton;
import com.google.ar.core.R;
import j$.util.Optional;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feq implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final /* synthetic */ int e;

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, uem] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.e) {
            case 0:
                tzx tzxVar = this.b;
                final fdq fdqVarA = ((ixw) this.a).a();
                final szh szhVar = (szh) tzxVar.a();
                final tzx tzxVar2 = this.d;
                final tzx tzxVar3 = this.c;
                return new mcw() { // from class: fep
                    @Override // java.lang.Runnable
                    public final void run() {
                        uem uemVar = tzxVar2;
                        szhVar.e((fel) uemVar.a());
                        uem uemVar2 = tzxVar3;
                        our ourVarJ = fdqVarA.j();
                        owf owfVar = (owf) uemVar2.a();
                        fel felVar = (fel) uemVar.a();
                        felVar.getClass();
                        ourVarJ.d(owfVar.dK(new fbt(felVar, 7), sxo.a));
                    }
                };
            case 1:
                fbm fbmVar = (fbm) this.a.a();
                owq owqVar = (owq) this.c.a();
                owq owqVar2 = (owq) this.b.a();
                return new fck(fbmVar, owqVar, owqVar2);
            case 2:
                tzx tzxVar4 = this.b;
                mwq mwqVarA = ((luo) this.a).a();
                return new ffm(mwqVarA, (hbj) this.c.a(), (luj) this.d.a());
            case 3:
                fdq fdqVarA2 = ((ixw) this.b).a();
                fgn fgnVar = (fgn) this.c.a();
                tzx tzxVar5 = this.a;
                tzx tzxVar6 = this.d;
                tzj tzjVarB = tzs.b(tzxVar5);
                fgq fgqVar = (fgq) tzxVar6.a();
                if (!fgnVar.b()) {
                    return Optional.empty();
                }
                shl shlVar = shx.a;
                ((fgr) tzjVarB.a()).a = fgqVar;
                fdqVarA2.j().d(new ffy(tzjVarB, 0));
                return Optional.of((nqo) tzjVarB.a());
            case 4:
                fgn fgnVar2 = (fgn) this.b.a();
                owf owfVar = (owf) this.d.a();
                owf owfVar2 = (owf) this.a.a();
                Optional optional = ((jux) this.c.a()).a;
                AtomicReference atomicReference = new AtomicReference(new owi(qpt.cl()));
                optional.ifPresent(new ksy(fgnVar2, owfVar, owfVar2, atomicReference, 1));
                owf owfVar3 = (owf) atomicReference.get();
                owfVar3.getClass();
                return owfVar3;
            case 5:
                fja fjaVar = (fja) this.c.a();
                lsp lspVar = (lsp) this.d.a();
                fqg fqgVar = (fqg) this.a.a();
                if (((hbj) this.b.a()).o(gyi.h)) {
                    lspVar.a(fjaVar);
                    fqgVar.b.d(new fid(lspVar, fjaVar, 1));
                }
                fjaVar.getClass();
                return fjaVar;
            case 6:
                tzx tzxVar7 = this.d;
                tzx tzxVar8 = this.c;
                final Context contextB = ((imm) this.a).b();
                final tzj tzjVarB2 = tzs.b(tzxVar8);
                hbj hbjVar = (hbj) tzxVar7.a();
                final fdq fdqVarA3 = ((ixw) this.b).a();
                return (hbjVar.o(gyi.h) && hbjVar.o(gyi.j)) ? new nkm() { // from class: fka
                    @Override // defpackage.nkm
                    public final void a() throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
                        View viewInflate = LayoutInflater.from(contextB).inflate(R.layout.cottage_step_by_step_edu_content, (ViewGroup) null);
                        tzj tzjVar = tzjVarB2;
                        our ourVarJ = fdqVarA3.j();
                        fjz fjzVar = (fjz) tzjVar.a();
                        fjzVar.d = viewInflate;
                        fjzVar.c = new PopupWindow(fjzVar.d, -1, -1, true);
                        fjzVar.y = (ConstraintLayout) fjzVar.d.findViewById(R.id.step_by_step_video_bottom_sheet_layout);
                        fjzVar.u = (FrameLayout) fjzVar.d.findViewById(R.id.step_by_step_video_container);
                        fjzVar.r = (LottieAnimationView) fjzVar.d.findViewById(R.id.step_by_step_video);
                        fjzVar.v = (ImageButton) fjzVar.d.findViewById(R.id.step_by_step_video_play_button);
                        fjzVar.s = (TextView) fjzVar.d.findViewById(R.id.step_by_step_video_title);
                        fjzVar.t = (TextView) fjzVar.d.findViewById(R.id.step_by_step_video_description);
                        fjzVar.w = (MaterialButton) fjzVar.d.findViewById(R.id.step_by_step_ok_button);
                        fjzVar.x = (MaterialButton) fjzVar.d.findViewById(R.id.step_by_step_dont_show_again_button);
                        cku ckuVar = fjzVar.j;
                        ckuVar.g(fjzVar.y);
                        ckuVar.e(fjzVar.y.getId());
                        ckuVar.e(fjzVar.u.getId());
                        ckuVar.e(fjzVar.s.getId());
                        ckuVar.e(fjzVar.t.getId());
                        ckuVar.e(fjzVar.w.getId());
                        ckuVar.e(fjzVar.x.getId());
                        ckuVar.l(fjzVar.y.getId(), 0);
                        ckuVar.k(fjzVar.y.getId(), 0);
                        ckuVar.j(fjzVar.u.getId(), 3, 0, 3, fjzVar.a(R.dimen.step_by_step_portrait_video_image_view_top_to_parent_top_margin));
                        ckuVar.d(fjzVar.u.getId(), 0);
                        ckuVar.l(fjzVar.u.getId(), fjzVar.a(R.dimen.step_by_step_video_image_view_width));
                        ckuVar.k(fjzVar.u.getId(), fjzVar.a(R.dimen.step_by_step_video_image_view_height));
                        ckuVar.l(fjzVar.s.getId(), fjzVar.a(R.dimen.step_by_step_video_title_width));
                        ckuVar.k(fjzVar.s.getId(), fjzVar.a(R.dimen.step_by_step_video_title_height));
                        ckuVar.j(fjzVar.s.getId(), 3, fjzVar.u.getId(), 4, fjzVar.a(R.dimen.step_by_step_portrait_video_title_top_to_video_image_view_bottom_margin));
                        ckuVar.d(fjzVar.s.getId(), 0);
                        ckuVar.l(fjzVar.t.getId(), fjzVar.a(R.dimen.step_by_step_video_description_width));
                        ckuVar.k(fjzVar.t.getId(), fjzVar.a(R.dimen.step_by_step_video_description_height));
                        ckuVar.j(fjzVar.t.getId(), 3, fjzVar.s.getId(), 4, fjzVar.a(R.dimen.step_by_step_portrait_video_description_top_to_video_title_bottom_margin));
                        ckuVar.d(fjzVar.t.getId(), 0);
                        ckuVar.l(fjzVar.w.getId(), fjzVar.a(R.dimen.step_by_step_ok_button_width));
                        ckuVar.k(fjzVar.w.getId(), fjzVar.a(R.dimen.step_by_step_ok_button_height));
                        fjzVar.w.k(fjzVar.a(R.dimen.step_by_step_button_corner_radius));
                        ckuVar.j(fjzVar.w.getId(), 3, fjzVar.t.getId(), 4, fjzVar.a(R.dimen.step_by_step_portrait_okay_button_top_to_video_description_bottom_margin));
                        ckuVar.d(fjzVar.w.getId(), 0);
                        ckuVar.l(fjzVar.x.getId(), fjzVar.a(R.dimen.step_by_step_dont_show_again_button_width));
                        ckuVar.k(fjzVar.x.getId(), fjzVar.a(R.dimen.step_by_step_dont_show_again_button_height));
                        fjzVar.x.k(fjzVar.a(R.dimen.step_by_step_button_corner_radius));
                        ckuVar.j(fjzVar.x.getId(), 3, fjzVar.w.getId(), 4, fjzVar.a(R.dimen.step_by_step_portrait_dont_show_again_button_top_to_ok_button_bottom_margin));
                        ckuVar.d(fjzVar.x.getId(), 0);
                        ckuVar.c(fjzVar.y);
                        ckuVar.g(fjzVar.y);
                        cku ckuVar2 = fjzVar.k;
                        ckuVar2.e(fjzVar.y.getId());
                        ckuVar2.e(fjzVar.u.getId());
                        ckuVar2.e(fjzVar.s.getId());
                        ckuVar2.e(fjzVar.t.getId());
                        ckuVar2.e(fjzVar.w.getId());
                        ckuVar2.e(fjzVar.x.getId());
                        ckuVar2.l(fjzVar.y.getId(), 0);
                        ckuVar2.k(fjzVar.y.getId(), 0);
                        ckuVar2.l(fjzVar.u.getId(), fjzVar.a(R.dimen.step_by_step_video_image_view_width));
                        ckuVar2.k(fjzVar.u.getId(), fjzVar.a(R.dimen.step_by_step_video_image_view_height));
                        ckuVar2.j(fjzVar.u.getId(), 3, 0, 3, fjzVar.a(R.dimen.step_by_step_landscape_video_image_view_top_to_parent_top_margin));
                        ckuVar2.j(fjzVar.u.getId(), 6, 0, 6, fjzVar.a(R.dimen.step_by_step_landscape_video_image_view_left_to_parent_left_margin));
                        ckuVar2.l(fjzVar.s.getId(), fjzVar.a(R.dimen.step_by_step_video_title_width));
                        ckuVar2.k(fjzVar.s.getId(), fjzVar.a(R.dimen.step_by_step_video_title_height));
                        ckuVar2.j(fjzVar.s.getId(), 3, 0, 3, fjzVar.a(R.dimen.step_by_step_landscape_video_title_top_to_parent_top_margin));
                        ckuVar2.i(fjzVar.s.getId(), 6, fjzVar.u.getId(), 7);
                        ckuVar2.i(fjzVar.s.getId(), 7, 0, 7);
                        ckuVar2.d(fjzVar.s.getId(), fjzVar.w.getId());
                        ckuVar2.l(fjzVar.t.getId(), fjzVar.a(R.dimen.step_by_step_video_description_width));
                        ckuVar2.k(fjzVar.t.getId(), fjzVar.a(R.dimen.step_by_step_video_description_height));
                        ckuVar2.j(fjzVar.t.getId(), 3, fjzVar.s.getId(), 4, fjzVar.a(R.dimen.step_by_step_landscape_video_description_top_to_video_title_bottom_margin));
                        ckuVar2.i(fjzVar.t.getId(), 6, fjzVar.u.getId(), 7);
                        ckuVar2.i(fjzVar.t.getId(), 7, 0, 7);
                        ckuVar2.d(fjzVar.t.getId(), fjzVar.w.getId());
                        ckuVar2.l(fjzVar.w.getId(), fjzVar.a(R.dimen.step_by_step_ok_button_width));
                        ckuVar2.k(fjzVar.w.getId(), fjzVar.a(R.dimen.step_by_step_ok_button_height));
                        fjzVar.w.k(fjzVar.a(R.dimen.step_by_step_button_corner_radius));
                        ckuVar2.j(fjzVar.w.getId(), 3, fjzVar.t.getId(), 4, fjzVar.a(R.dimen.step_by_step_landscape_okay_button_top_to_video_description_bottom_margin));
                        ckuVar2.i(fjzVar.w.getId(), 6, fjzVar.u.getId(), 7);
                        ckuVar2.i(fjzVar.w.getId(), 7, 0, 7);
                        ckuVar2.l(fjzVar.x.getId(), fjzVar.a(R.dimen.step_by_step_dont_show_again_button_width));
                        ckuVar2.k(fjzVar.x.getId(), fjzVar.a(R.dimen.step_by_step_dont_show_again_button_height));
                        fjzVar.x.k(fjzVar.a(R.dimen.step_by_step_button_corner_radius));
                        ckuVar2.i(fjzVar.x.getId(), 3, fjzVar.w.getId(), 4);
                        ckuVar2.i(fjzVar.x.getId(), 6, fjzVar.u.getId(), 7);
                        ckuVar2.i(fjzVar.x.getId(), 7, 0, 7);
                        ckuVar2.d(fjzVar.x.getId(), fjzVar.w.getId());
                        cku ckuVar3 = fjzVar.l;
                        ckuVar3.g(fjzVar.y);
                        ckuVar3.e(fjzVar.y.getId());
                        ckuVar3.e(fjzVar.u.getId());
                        ckuVar3.e(fjzVar.s.getId());
                        ckuVar3.e(fjzVar.t.getId());
                        ckuVar3.e(fjzVar.w.getId());
                        ckuVar3.e(fjzVar.x.getId());
                        ckuVar3.l(fjzVar.y.getId(), 0);
                        ckuVar3.k(fjzVar.y.getId(), 0);
                        ckuVar3.l(fjzVar.u.getId(), fjzVar.a(R.dimen.step_by_step_video_image_view_width_tablet));
                        ckuVar3.k(fjzVar.u.getId(), fjzVar.a(R.dimen.step_by_step_video_image_view_height_tablet));
                        ckuVar3.j(fjzVar.u.getId(), 3, 0, 3, fjzVar.a(R.dimen.step_by_step_video_image_view_top_to_parent_top_margin_tablet));
                        ckuVar3.d(fjzVar.u.getId(), 0);
                        ckuVar3.l(fjzVar.s.getId(), fjzVar.a(R.dimen.step_by_step_video_title_width_tablet));
                        ckuVar3.k(fjzVar.s.getId(), fjzVar.a(R.dimen.step_by_step_video_title_height_tablet));
                        ckuVar3.j(fjzVar.s.getId(), 3, fjzVar.u.getId(), 4, fjzVar.a(R.dimen.step_by_step_video_title_top_to_image_view_bottom_margin_tablet));
                        ckuVar3.d(fjzVar.s.getId(), 0);
                        ckuVar3.l(fjzVar.t.getId(), fjzVar.a(R.dimen.step_by_step_video_description_width_tablet));
                        ckuVar3.k(fjzVar.t.getId(), fjzVar.a(R.dimen.step_by_step_video_description_height_tablet));
                        ckuVar3.j(fjzVar.t.getId(), 3, fjzVar.s.getId(), 4, fjzVar.a(R.dimen.step_by_step_video_description_top_to_video_title_bottom_margin_tablet));
                        ckuVar3.d(fjzVar.t.getId(), 0);
                        ckuVar3.l(fjzVar.w.getId(), fjzVar.a(R.dimen.step_by_step_ok_button_width_tablet));
                        ckuVar3.k(fjzVar.w.getId(), fjzVar.a(R.dimen.step_by_step_ok_button_height_tablet));
                        fjzVar.w.k(fjzVar.a(R.dimen.step_by_step_button_corner_radius));
                        ckuVar3.j(fjzVar.w.getId(), 3, fjzVar.t.getId(), 4, fjzVar.a(R.dimen.step_by_step_ok_button_top_to_video_description_bottom_margin_tablet));
                        ckuVar3.d(fjzVar.w.getId(), 0);
                        ckuVar3.l(fjzVar.x.getId(), fjzVar.a(R.dimen.step_by_step_dont_show_again_button_width_tablet));
                        ckuVar3.k(fjzVar.x.getId(), fjzVar.a(R.dimen.step_by_step_dont_show_again_button_height_tablet));
                        fjzVar.x.k(fjzVar.a(R.dimen.step_by_step_button_corner_radius));
                        ckuVar3.j(fjzVar.x.getId(), 3, fjzVar.w.getId(), 4, fjzVar.a(R.dimen.step_by_step_dont_show_again_button_top_to_okay_button_bottom_margin_tablet));
                        ckuVar3.d(fjzVar.x.getId(), 0);
                        our ourVar = new our();
                        ourVar.d(fjzVar.g.dK(new fbt(fjzVar, 14), fjzVar.h));
                        ourVarJ.d(ourVar);
                    }
                } : nkm.r;
            case 7:
                tzx tzxVar9 = this.a;
                return new fng(((imm) this.c).b(), ((fmj) this.d).b(), (out) tzxVar9.a(), hmp.b(), (fnc) this.b.a());
            case 8:
                hbj hbjVar2 = (hbj) this.a.a();
                return new gno(hbjVar2, this.d);
            case 9:
                return new fpb(((imm) this.b).b(), (fto) this.d.a(), (ScheduledExecutorService) this.c.a(), (ScheduledExecutorService) this.a.a(), 2);
            case 10:
                return new fyc((got) this.c.a(), (gav) this.a.a(), (ngw) this.b.a(), (pbn) this.d.a());
            case 11:
                return new gay((owf) this.c.a(), (ktx) this.d.a(), ((fef) this.a).a(), ((ixw) this.b).a());
            case 12:
                return new gbb((ocq) this.d.a(), (fyw) this.a.a(), (mzz) this.c.a(), (out) this.b.a());
            case 13:
                return new gkw(((imm) this.c).b(), (muu) this.d.a(), (mni) this.b.a(), (hbj) this.a.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                hbj hbjVar3 = (hbj) this.c.a();
                ((ixw) this.b).a();
                hax.d(hbjVar3);
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            case 15:
                hbj hbjVar4 = (hbj) this.c.a();
                ((ixw) this.b).a();
                hax.d(hbjVar4);
                sfd sfdVar2 = sfd.a;
                sfdVar2.getClass();
                return sfdVar2;
            case 16:
                return new gmt((imi) this.a.a(), ((imm) this.c).b(), (ktx) this.d.a(), (mny) this.b.a());
            case 17:
                hbj hbjVar5 = (hbj) this.a.a();
                tzx tzxVar10 = this.d;
                final ocq ocqVarA = ((ngy) this.c).a();
                final gli gliVar = (gli) tzxVar10.a();
                if (!hbjVar5.p(gzo.by)) {
                    return new gnc(0);
                }
                final tzx tzxVar11 = this.b;
                return new nkm() { // from class: gnd
                    @Override // defpackage.nkm
                    public final void a() throws Resources.NotFoundException {
                        ViewStub viewStub = (ViewStub) ocqVarA.c(R.id.video_speed_controls);
                        viewStub.setLayoutResource(R.layout.video_speed_controls);
                        gli gliVar2 = gliVar;
                        gliVar2.a(viewStub);
                        ((MainActivityLayout) ((ngx) tzxVar11).a().c).h(gliVar2);
                    }
                };
            case 18:
                tzx tzxVar12 = this.b;
                got gotVarA = ((gol) this.c).a();
                CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase = (CameraFatalErrorTrackerDatabase) tzxVar12.a();
                tzx tzxVar13 = this.d;
                Executor executorB = ((fth) this.a).b();
                return new gox(gotVarA, cameraFatalErrorTrackerDatabase, executorB);
            case 19:
                return new grj(((imm) this.b).b(), (iso) this.a.a(), new pql(), (hbj) this.c.a(), (gsm) this.d.a());
            default:
                tzx tzxVar14 = this.b;
                ocq ocqVarA2 = ((lyv) this.a).a();
                Executor executor = (Executor) tzxVar14.a();
                owf owfVar4 = (owf) this.d.a();
                boolean zP = ((hbj) this.c.a()).p(gzw.o);
                pit pitVar = (pit) ocqVarA2.a.a();
                pitVar.getClass();
                executor.getClass();
                owfVar4.getClass();
                return new lyu(pitVar, executor, owfVar4, zP);
        }
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr, byte[] bArr2) {
        this.e = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[] cArr, byte[] bArr) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[] fArr) {
        this.e = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[] iArr) {
        this.e = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, short[] sArr) {
        this.e = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[] zArr) {
        this.e = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[][] cArr) {
        this.e = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[][] fArr) {
        this.e = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[][] iArr) {
        this.e = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, short[][] sArr) {
        this.e = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.a = tzxVar4;
    }

    public feq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[][][] fArr) {
        this.e = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
    }
}
