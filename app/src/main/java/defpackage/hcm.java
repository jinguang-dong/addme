package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;
import com.google.googlex.gcam.Gcam;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcm implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final /* synthetic */ int f;

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i) {
        this.f = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        owf owiVar;
        switch (this.f) {
            case 0:
                return new hcl(((imm) this.a).b(), (hcb) this.b.a(), (hcf) this.c.a(), (lrp) this.d.a(), (mfq) this.e.a());
            case 1:
                mhq mhqVar = (mhq) this.b.a();
                return new sfm(new gtd((Executor) this.a.a(), (owq) this.c.a(), ((mia) this.e).b(), ((ixw) this.d).a(), mhqVar, 0));
            case 2:
                tzx tzxVar = this.e;
                tzx tzxVar2 = this.b;
                tzx tzxVar3 = this.d;
                return new hgo((hgs) this.c.a(), ((ixw) this.a).a(), ((ixv) tzxVar3).a(), ((hgr) tzxVar2).a(), (out) tzxVar.a());
            case 3:
                final hms hmsVar = (hms) this.e.a();
                final hms hmsVar2 = (hms) this.a.a();
                final hms hmsVar3 = (hms) this.b.a();
                final hms hmsVar4 = (hms) this.c.a();
                hlf hlfVarB = ((hmn) this.d).b();
                hls hlsVar = new hls(hmsVar);
                hlsVar.c = hlfVarB;
                hlsVar.d(new hlv() { // from class: hly
                    @Override // defpackage.hlv
                    public final void a(long j, poe poeVar) {
                        float fA = hmsVar2.a(j) * 0.15f;
                        float fA2 = hmsVar3.a(j) * 0.25f;
                        hmsVar.e(j, fA + fA2 + (hmsVar4.a(j) * 0.6f));
                    }
                });
                return hlsVar.a();
            case 4:
                Context contextB = ((imm) this.a).b();
                Resources resourcesB = ((hoa) this.e).b();
                qqq qqqVar = (qqq) this.d.a();
                hnq hnqVarA = ((hob) this.b).a();
                FocusIndicatorView focusIndicatorViewA = ((hnz) this.c).a();
                ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(contextB, R.animator.active_focus_scan_inner_splash_diameter_scale_up);
                valueAnimator.addUpdateListener(new fve(qqqVar, 6, null));
                ValueAnimator valueAnimator2 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB, R.animator.active_focus_scan_inner_splash_opacity_fade_in);
                valueAnimator2.addUpdateListener(new fve(qqqVar, 7, null));
                ValueAnimator valueAnimator3 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB, R.animator.active_focus_scan_inner_splash_opacity_fade_out);
                valueAnimator3.addUpdateListener(new fve(qqqVar, 7, null));
                ValueAnimator valueAnimator4 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB, R.animator.active_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator4.addUpdateListener(new fve(qqqVar, 8, null));
                ValueAnimator valueAnimator5 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB, R.animator.active_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator5.addUpdateListener(new fve(qqqVar, 9, null));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5);
                animatorSet.addListener(new hoi(hnqVarA, resourcesB, focusIndicatorViewA));
                animatorSet.addListener(new nln());
                return ojl.bg(animatorSet);
            case 5:
                Context contextB2 = ((imm) this.a).b();
                Resources resourcesB2 = ((hoa) this.e).b();
                qqq qqqVar2 = (qqq) this.d.a();
                hnq hnqVarA2 = ((hob) this.b).a();
                FocusIndicatorView focusIndicatorViewA2 = ((hnz) this.c).a();
                ValueAnimator valueAnimator6 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB2, R.animator.focus_lock_hold_inner_splash_diameter_scale_up);
                valueAnimator6.addUpdateListener(new fve(qqqVar2, 6, null));
                ValueAnimator valueAnimator7 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB2, R.animator.focus_lock_hold_inner_splash_opacity_fade_in);
                valueAnimator7.addUpdateListener(new fve(qqqVar2, 7, null));
                ValueAnimator valueAnimator8 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB2, R.animator.focus_lock_hold_outer_ring_opacity_fade_in);
                valueAnimator8.addUpdateListener(new fve(qqqVar2, 9, null));
                ValueAnimator valueAnimator9 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB2, R.animator.focus_lock_hold_outer_ring_thickness_scale_up);
                valueAnimator9.addUpdateListener(new fve(qqqVar2, 10, null));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(valueAnimator6).with(valueAnimator7).with(valueAnimator8).with(valueAnimator9);
                animatorSet2.addListener(new hoo(hnqVarA2, resourcesB2, focusIndicatorViewA2));
                animatorSet2.addListener(new nln());
                return ojl.bg(animatorSet2);
            case 6:
                Context contextB3 = ((imm) this.a).b();
                Resources resourcesB3 = ((hoa) this.e).b();
                qqq qqqVar3 = (qqq) this.d.a();
                hnq hnqVarA3 = ((hob) this.b).a();
                FocusIndicatorView focusIndicatorViewA3 = ((hnz) this.c).a();
                ValueAnimator valueAnimator10 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB3, R.animator.passive_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator10.addUpdateListener(new fve(qqqVar3, 8, null));
                ValueAnimator valueAnimator11 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB3, R.animator.passive_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator11.addUpdateListener(new fve(qqqVar3, 9, null));
                ValueAnimator valueAnimator12 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB3, R.animator.passive_focus_converge_outer_ring_half_opacity);
                valueAnimator12.addUpdateListener(new fve(qqqVar3, 12, null));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(valueAnimator10, valueAnimator11, valueAnimator11);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playSequentially(animatorSet3, valueAnimator12);
                animatorSet4.addListener(new hol(hnqVarA3, contextB3, resourcesB3, focusIndicatorViewA3));
                animatorSet4.addListener(new nln());
                return ojl.bg(animatorSet4);
            case 7:
                Context contextB4 = ((imm) this.a).b();
                Resources resourcesB4 = ((hoa) this.e).b();
                qqq qqqVar4 = (qqq) this.d.a();
                hnq hnqVarA4 = ((hob) this.b).a();
                FocusIndicatorView focusIndicatorViewA4 = ((hnz) this.c).a();
                ValueAnimator valueAnimator13 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB4, R.animator.passive_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator13.addUpdateListener(new fve(qqqVar4, 8, null));
                ValueAnimator valueAnimator14 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB4, R.animator.passive_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator14.addUpdateListener(new fve(qqqVar4, 9, null));
                ValueAnimator valueAnimator15 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB4, R.animator.passive_focus_converge_outer_ring_half_opacity);
                valueAnimator15.addUpdateListener(new fve(qqqVar4, 12, null));
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(valueAnimator13, valueAnimator14, valueAnimator14);
                AnimatorSet animatorSet6 = new AnimatorSet();
                animatorSet6.playSequentially(animatorSet5, valueAnimator15);
                animatorSet6.addListener(new hok(hnqVarA4, resourcesB4, focusIndicatorViewA4));
                animatorSet6.addListener(new nln());
                return ojl.bg(animatorSet6);
            case 8:
                Context contextB5 = ((imm) this.a).b();
                Resources resourcesB5 = ((hoa) this.e).b();
                qqq qqqVar5 = (qqq) this.d.a();
                hnq hnqVarA5 = ((hob) this.b).a();
                FocusIndicatorView focusIndicatorViewA5 = ((hnz) this.c).a();
                ValueAnimator valueAnimator16 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB5, R.animator.active_focus_scan_inner_splash_diameter_scale_up);
                valueAnimator16.addUpdateListener(new fve(qqqVar5, 6, null));
                ValueAnimator valueAnimator17 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB5, R.animator.active_focus_scan_inner_splash_opacity_fade_in);
                valueAnimator17.addUpdateListener(new fve(qqqVar5, 7, null));
                ValueAnimator valueAnimator18 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB5, R.animator.active_focus_scan_inner_splash_opacity_fade_out);
                valueAnimator18.addUpdateListener(new fve(qqqVar5, 7, null));
                ValueAnimator valueAnimator19 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB5, R.animator.active_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator19.addUpdateListener(new fve(qqqVar5, 8, null));
                ValueAnimator valueAnimator20 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB5, R.animator.active_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator20.addUpdateListener(new fve(qqqVar5, 9, null));
                AnimatorSet animatorSet7 = new AnimatorSet();
                animatorSet7.playTogether(valueAnimator16, valueAnimator17, valueAnimator18, valueAnimator19, valueAnimator20);
                animatorSet7.addListener(new hoj(hnqVarA5, resourcesB5, focusIndicatorViewA5));
                animatorSet7.addListener(new nln());
                return ojl.bg(animatorSet7);
            case 9:
                Context contextB6 = ((imm) this.a).b();
                Resources resourcesB6 = ((hoa) this.e).b();
                qqq qqqVar6 = (qqq) this.d.a();
                hnq hnqVarA6 = ((hob) this.b).a();
                FocusIndicatorView focusIndicatorViewA6 = ((hnz) this.c).a();
                ValueAnimator valueAnimator21 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB6, R.animator.passive_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator21.addUpdateListener(new fve(qqqVar6, 8, null));
                ValueAnimator valueAnimator22 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB6, R.animator.passive_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator22.addUpdateListener(new fve(qqqVar6, 9, null));
                AnimatorSet animatorSet8 = new AnimatorSet();
                animatorSet8.playTogether(valueAnimator21, valueAnimator22);
                animatorSet8.addListener(new hom(hnqVarA6, resourcesB6, focusIndicatorViewA6));
                animatorSet8.addListener(new nln());
                return ojl.bg(animatorSet8);
            case 10:
                final how howVar = (how) this.b.a();
                final hpa hpaVar = (hpa) this.c.a();
                tzx tzxVar4 = this.d;
                Object objA = this.e.a();
                final our ourVar = (our) tzxVar4.a();
                final hpf hpfVar = (hpf) objA;
                final tzx tzxVar5 = this.a;
                return new sfm(new frf(new Runnable() { // from class: hov
                    @Override // java.lang.Runnable
                    public final void run() {
                        uem uemVar = tzxVar5;
                        Executor executor = (Executor) uemVar.a();
                        hpa hpaVar2 = hpaVar;
                        hpf hpfVar2 = hpfVar;
                        hpaVar2.c(hpfVar2, executor);
                        ourVar.d(hpfVar2.b(howVar, (Executor) uemVar.a()));
                    }
                }, "metadataFrameStore", 0));
            case 11:
                return new hpj((hpa) this.c.a(), ((fef) this.b).a(), (nms) this.e.a(), (Executor) this.a.a(), ((kiv) this.d).a());
            case 12:
                mfq mfqVar = (mfq) this.c.a();
                hqw hqwVar = (hqw) this.e.a();
                return new hqe(mfqVar, hqwVar, (hqc) this.b.a(), (hbj) this.d.a());
            case 13:
                return new sfm(new frf(new iax((our) this.c.a(), (owf) this.d.a(), (Executor) this.a.a(), (owf) this.e.a(), (owq) this.b.a(), 0), "lowlightscene", 0));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new icd((owf) this.d.a(), (owf) this.a.a(), (owf) this.b.a(), (owf) this.c.a(), (owq) this.e.a());
            case 15:
                nms nmsVar = (nms) this.c.a();
                Map map = (Map) this.e.a();
                return new ieo(nmsVar, map, (jwd) this.a.a(), new gyn(20), (hbj) this.b.a());
            case 16:
                return new iex((ovx) this.c.a(), (ovx) this.d.a(), (hbj) this.a.a(), (our) this.b.a(), (mdy) this.e.a());
            case 17:
                if (((idt) this.a.a()).e()) {
                    tzx tzxVar6 = this.e;
                    peo peoVar = (peo) ((Map) tzxVar6.a()).get(lcz.RAW_TELE);
                    peo peoVar2 = (peo) ((Map) tzxVar6.a()).get(lcz.RAW_WIDE);
                    if (peoVar != null && peoVar2 != null) {
                        tzx tzxVar7 = this.b;
                        tzx tzxVar8 = this.c;
                        float fD = ins.d(peoVar2.d(), (hzs) tzxVar8.a(), (Gcam) tzxVar7.a());
                        float fD2 = ins.d(peoVar.d(), (hzs) tzxVar8.a(), (Gcam) tzxVar7.a());
                        if (fD < 0.0f || fD2 < 0.0f) {
                            pab pabVar = (pab) this.d;
                            fD = ins.e(pabVar.a().a(peoVar2.d())).floatValue();
                            fD2 = ins.e(pabVar.a().a(peoVar.d())).floatValue();
                        }
                        if (fD > 0.0f && fD2 > 0.0f) {
                            return rwc.j(Float.valueOf(fD / fD2));
                        }
                    }
                }
                return rvk.a;
            case 18:
                if (((idt) this.a.a()).e()) {
                    tzx tzxVar9 = this.b;
                    tzx tzxVar10 = this.c;
                    float fFloatValue = ((Float) ((hbj) tzxVar9.a()).e(gzc.K).orElse(Float.valueOf(2.45f))).floatValue();
                    float fFloatValue2 = ((Float) ((hbj) tzxVar9.a()).e(gzc.L).orElse(Float.valueOf(4.9f))).floatValue();
                    ArrayList arrayList = new ArrayList();
                    pjr pjrVar = (pjr) ((Map) tzxVar10.a()).get(lcz.RAW_WIDE);
                    pjrVar.getClass();
                    arrayList.add(pjrVar.a);
                    Map map2 = (Map) tzxVar10.a();
                    lcz lczVar = lcz.RAW_WIDE_RM;
                    if (map2.containsKey(lczVar)) {
                        pjr pjrVar2 = (pjr) ((Map) tzxVar10.a()).get(lczVar);
                        pjrVar2.getClass();
                        arrayList.add(pjrVar2.a);
                    }
                    owiVar = owb.a(owl.c(owl.h((owf) this.e.a(), new lcb(fFloatValue, fFloatValue2, 1)), owl.h((owf) this.d.a(), new fdz(arrayList, 16))));
                } else {
                    owiVar = new owi(false);
                }
                owiVar.getClass();
                return owiVar;
            case 19:
                ggg gggVar = (ggg) this.b.a();
                tzx tzxVar11 = this.e;
                return new iko(gggVar, ((izg) this.c).a(), ((imn) this.d).a(), ((ngx) this.a).a(), (nmw) tzxVar11.a());
            default:
                return new ipp(((imm) this.a).b(), (mni) this.d.a(), (pnq) this.b.a(), (luj) this.e.a(), (owf) this.c.a());
        }
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[] bArr) {
        this.f = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
        this.e = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[] cArr) {
        this.f = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.e = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[] cArr, byte[] bArr) {
        this.f = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.b = tzxVar3;
        this.e = tzxVar4;
        this.c = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[] fArr) {
        this.f = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
        this.c = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[] sArr) {
        this.f = i;
        this.e = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.d = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[][] fArr) {
        this.f = i;
        this.c = tzxVar;
        this.e = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
        this.d = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[][] iArr) {
        this.f = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.e = tzxVar3;
        this.d = tzxVar4;
        this.a = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[][] zArr) {
        this.f = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.a = tzxVar4;
        this.d = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, byte[][][] bArr) {
        this.f = i;
        this.d = tzxVar;
        this.b = tzxVar2;
        this.e = tzxVar3;
        this.c = tzxVar4;
        this.a = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, char[][][] cArr) {
        this.f = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
        this.e = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, float[][][] fArr) {
        this.f = i;
        this.a = tzxVar;
        this.e = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.b = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, int[][][] iArr) {
        this.f = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
        this.e = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, short[][][] sArr) {
        this.f = i;
        this.c = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
        this.b = tzxVar5;
    }

    public hcm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, int i, boolean[][][] zArr) {
        this.f = i;
        this.e = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
        this.a = tzxVar5;
    }
}
