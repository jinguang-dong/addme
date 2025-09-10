package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import com.google.ar.core.R;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmd implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public hmd(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    public static Set b(hbj hbjVar, uem uemVar) {
        Set sfmVar = !hbjVar.p(gyy.a) ? sfd.a : new sfm(new frf(new hjp(uemVar, 6), "sensorconsumer", 0));
        sfmVar.getClass();
        return sfmVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                return hgc.d(new lpt(3), (hms) this.a.a(), ((hmn) this.b).b());
            case 1:
                return hgc.d(new lpt(2), (hms) this.a.a(), ((hmn) this.b).b());
            case 2:
                return hgc.d(new lpt(4), (hms) this.a.a(), ((hmn) this.b).b());
            case 3:
                return new gox(((inh) this.a).a(), ((tzz) this.b).a());
            case 4:
                return b((hbj) this.b.a(), this.a);
            case 5:
                Object sfmVar = !((hbj) this.a.a()).p(gyy.a) ? sfd.a : new sfm(new hwk(this.b, 1));
                sfmVar.getClass();
                return sfmVar;
            case 6:
                Context contextB = ((imm) this.a).b();
                qqq qqqVar = (qqq) this.b.a();
                ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(contextB, R.animator.active_focus_converge_outer_ring_opacity_fade_out);
                valueAnimator.addUpdateListener(new fve(qqqVar, 9, null));
                valueAnimator.addListener(new nln());
                return ojl.bg(valueAnimator);
            case 7:
                Context contextB2 = ((imm) this.a).b();
                qqq qqqVar2 = (qqq) this.b.a();
                ValueAnimator valueAnimator2 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB2, R.animator.passive_focus_converge_outer_face_rectangle_opacity_fade_out);
                valueAnimator2.addUpdateListener(new fve(qqqVar2, 9, null));
                valueAnimator2.addListener(new nln());
                return ojl.bg(valueAnimator2);
            case 8:
                Context contextB3 = ((imm) this.a).b();
                qqq qqqVar3 = (qqq) this.b.a();
                ValueAnimator valueAnimator3 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB3, R.animator.focus_lock_release_inner_splash_diameter_scale_down);
                valueAnimator3.addUpdateListener(new fve(qqqVar3, 6, null));
                ValueAnimator valueAnimator4 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB3, R.animator.focus_lock_release_inner_splash_opacity_fade_out);
                valueAnimator4.addUpdateListener(new fve(qqqVar3, 7, null));
                ValueAnimator valueAnimator5 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB3, R.animator.focus_lock_release_outer_ring_diameter_scale_down);
                valueAnimator5.addUpdateListener(new fve(qqqVar3, 8, null));
                ValueAnimator valueAnimator6 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB3, R.animator.focus_lock_release_outer_ring_opacity_fade_out);
                valueAnimator6.addUpdateListener(new fve(qqqVar3, 9, null));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6);
                animatorSet.addListener(new nln());
                return ojl.bg(animatorSet);
            case 9:
                Context contextB4 = ((imm) this.a).b();
                qqq qqqVar4 = (qqq) this.b.a();
                ValueAnimator valueAnimator7 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB4, R.animator.tracking_end_outer_ring_diameter_scale_up);
                valueAnimator7.addUpdateListener(new fve(qqqVar4, 8, null));
                ValueAnimator valueAnimator8 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB4, R.animator.tracking_end_outer_ring_opacity_fade_out);
                valueAnimator8.addUpdateListener(new fve(qqqVar4, 9, null));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setInterpolator(new cvn());
                animatorSet2.playTogether(valueAnimator7, valueAnimator8);
                animatorSet2.addListener(new nln());
                return ojl.bg(animatorSet2);
            case 10:
                Context contextB5 = ((imm) this.a).b();
                qqq qqqVar5 = (qqq) this.b.a();
                ValueAnimator valueAnimator9 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB5, R.animator.tracking_end_outer_ring_half_opacity_fade_out);
                valueAnimator9.addUpdateListener(new fve(qqqVar5, 9, null));
                valueAnimator9.setStartDelay(0L);
                valueAnimator9.addListener(new nln());
                return ojl.bg(valueAnimator9);
            case 11:
                Context contextB6 = ((imm) this.a).b();
                qqq qqqVar6 = (qqq) this.b.a();
                ValueAnimator valueAnimator10 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB6, R.animator.long_press_focus_lock_opacity_fade_out);
                valueAnimator10.addUpdateListener(new fve(qqqVar6, 9, null));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(valueAnimator10);
                animatorSet3.addListener(new nln());
                return ojl.bg(animatorSet3);
            case 12:
                Context contextB7 = ((imm) this.a).b();
                qqq qqqVar7 = (qqq) this.b.a();
                ValueAnimator valueAnimator11 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB7, R.animator.macro_focus_hold_opacity_fade_out);
                valueAnimator11.addUpdateListener(new fve(qqqVar7, 11, null));
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.play(valueAnimator11);
                animatorSet4.addListener(new nln());
                return ojl.bg(animatorSet4);
            case 13:
                Context contextB8 = ((imm) this.a).b();
                qqq qqqVar8 = (qqq) this.b.a();
                ValueAnimator valueAnimator12 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB8, R.animator.passive_focus_converge_outer_ring_half_opacity_fade_out);
                valueAnimator12.addUpdateListener(new fve(qqqVar8, 9, null));
                valueAnimator12.setStartDelay(0L);
                valueAnimator12.addListener(new nln());
                return ojl.bg(valueAnimator12);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Context contextB9 = ((imm) this.a).b();
                qqq qqqVar9 = (qqq) this.b.a();
                ValueAnimator valueAnimator13 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB9, R.animator.passive_focus_converge_outer_ring_half_opacity);
                valueAnimator13.addUpdateListener(new fve(qqqVar9, 9, null));
                ValueAnimator valueAnimator14 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB9, R.animator.passive_focus_converge_outer_ring_half_opacity_fade_out);
                valueAnimator14.addUpdateListener(new fve(qqqVar9, 9, null));
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playSequentially(valueAnimator13, valueAnimator14);
                animatorSet5.addListener(new nln());
                return ojl.bg(animatorSet5);
            case 15:
                Context contextB10 = ((imm) this.a).b();
                qqq qqqVar10 = (qqq) this.b.a();
                ValueAnimator valueAnimator15 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB10, R.animator.passive_focus_converge_outer_ring_opacity_fade_out);
                valueAnimator15.addUpdateListener(new fve(qqqVar10, 9, null));
                valueAnimator15.addListener(new nln());
                return ojl.bg(valueAnimator15);
            case 16:
                try {
                    qla qlaVar = (qla) this.b.a();
                    int i = hph.a * 10;
                    long jConvert = TimeUnit.NANOSECONDS.convert(1500000000L, TimeUnit.NANOSECONDS);
                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    return rwc.j(new hoq(qlaVar, i, atomicBoolean, new pmv(new hop(atomicBoolean, new AtomicBoolean(true), jConvert))));
                } catch (Exception unused) {
                    ((sgt) hor.a.b().M(1410)).s("Error trying to initialize audio");
                    return rvk.a;
                }
            case 17:
                qlc qlcVar = new qlc(new qlb(new AudioRecord.Builder().setAudioSource(5).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(48000).setChannelMask(12).build()).setBufferSizeInBytes(hph.a * 10).build(), 1), (ExecutorService) this.a.a());
                boolean z = qia.a;
                return qlcVar;
            case 18:
                return new hpf((hpa) this.a.a(), (nms) this.b.a());
            case 19:
                tzx tzxVar = this.a;
                rwc rwcVarB = ((fkh) this.b).b();
                rwc rwcVar = (rwc) tzxVar.a();
                return rwcVarB.h() ? rwc.j((hpu) rwcVarB.c()) : rwcVar.h() ? rwc.j((hpu) rwcVar.c()) : rvk.a;
            default:
                return new hqw(((hqt) this.b).a(), ((hqy) this.a).a());
        }
    }

    public hmd(tzx tzxVar, tzx tzxVar2, int i, int[] iArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
