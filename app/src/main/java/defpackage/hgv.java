package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgv implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final /* synthetic */ int e;

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    /* JADX WARN: Type inference failed for: r0v56, types: [sgt, shi] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        pbn pbnVar;
        Object sfmVar;
        Object sfmVar2;
        switch (this.e) {
            case 0:
                hbj hbjVar = (hbj) this.a.a();
                ((hfl) this.b).a();
                return new hgu(hbjVar, (pbn) this.c.a(), (cxb) this.d.a());
            case 1:
                owq owqVar = (owq) this.b.a();
                tzx tzxVar = this.c;
                fdq fdqVarA = ((ixw) this.a).a();
                hdm hdmVar = (hdm) tzxVar.a();
                ndj ndjVar = (ndj) this.d.a();
                Executor executor = hdi.a;
                return new gtr(fdqVarA, owqVar, hdmVar, ndjVar, 2);
            case 2:
                return new hjq((hjy) this.a.a(), (owq) this.d.a(), ((Boolean) this.c.a()).booleanValue(), this.b, 1);
            case 3:
                return new hjo(((imm) this.c).b(), (mni) this.b.a(), (out) this.d.a(), (owq) this.a.a());
            case 4:
                Object sfmVar3 = (((Boolean) this.a.a()).booleanValue() && ((Boolean) this.d.a()).booleanValue()) ? new sfm(new npo((npn) this.b.a(), (owf) this.c.a(), npm.FACE_BEAUTIFICATION)) : sfd.a;
                sfmVar3.getClass();
                return sfmVar3;
            case 5:
                tzx tzxVar2 = this.b;
                owf owfVarB = ((lxh) this.c).b();
                boolean zBooleanValue = ((Boolean) tzxVar2.a()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) this.d.a()).booleanValue();
                hjy hjyVar = new hjy((Executor) this.a.a());
                hjyVar.h(owl.h(owfVarB, new hjz(zBooleanValue, zBooleanValue2, 2)));
                return hjyVar;
            case 6:
                return new hla((Executor) this.a.a(), (rwc) this.c.a(), (rwc) this.d.a(), ((tzz) this.b).a(), new hkz());
            case 7:
                Context contextB = ((imm) this.b).b();
                Resources resourcesB = ((hoa) this.d).b();
                qqq qqqVar = (qqq) this.a.a();
                hnq hnqVarA = ((hob) this.c).a();
                ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(contextB, R.animator.long_press_focus_lock_opacity_fade_in);
                valueAnimator.addUpdateListener(new fve(qqqVar, 9, null));
                ValueAnimator valueAnimator2 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB, R.animator.long_press_focus_lock_size_scale_up);
                valueAnimator2.addUpdateListener(new fve(qqqVar, 8, null));
                ValueAnimator valueAnimator3 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB, R.animator.long_press_focus_lock_size_scale_down);
                valueAnimator3.addUpdateListener(new fve(qqqVar, 8, null));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(valueAnimator, valueAnimator2, valueAnimator3);
                animatorSet.addListener(new hog(hnqVarA, contextB, resourcesB));
                animatorSet.addListener(new nln());
                return ojl.bg(animatorSet);
            case 8:
                Context contextB2 = ((imm) this.b).b();
                FocusIndicatorView focusIndicatorViewA = ((hnz) this.d).a();
                hnq hnqVarA2 = ((hob) this.c).a();
                qqq qqqVar2 = (qqq) this.a.a();
                ValueAnimator valueAnimator4 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB2, R.animator.long_press_focus_lock_opacity_fade_out);
                valueAnimator4.addUpdateListener(new fve(qqqVar2, 9, null));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(valueAnimator4);
                animatorSet2.addListener(new hof(hnqVarA2, focusIndicatorViewA));
                animatorSet2.addListener(new nln());
                return ojl.bg(animatorSet2);
            case 9:
                Context contextB3 = ((imm) this.b).b();
                Resources resourcesB2 = ((hoa) this.d).b();
                qqq qqqVar3 = (qqq) this.a.a();
                hnq hnqVarA3 = ((hob) this.c).a();
                ValueAnimator valueAnimator5 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB3, R.animator.nairobi_long_press_focus_lock_size_scale_down);
                valueAnimator5.addUpdateListener(new fve(qqqVar3, 8, null));
                ValueAnimator valueAnimator6 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB3, R.animator.nairobi_long_press_focus_lock_size_scale_up);
                valueAnimator6.addUpdateListener(new fve(qqqVar3, 8, null));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(valueAnimator5, valueAnimator6);
                animatorSet3.addListener(new hoh(hnqVarA3, contextB3, resourcesB2));
                animatorSet3.addListener(new nln());
                return ojl.bg(animatorSet3);
            case 10:
                Context contextB4 = ((imm) this.b).b();
                Resources resourcesB3 = ((hoa) this.d).b();
                qqq qqqVar4 = (qqq) this.a.a();
                hnq hnqVarA4 = ((hob) this.c).a();
                ValueAnimator valueAnimator7 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB4, R.animator.passive_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator7.addUpdateListener(new fve(qqqVar4, 8, null));
                ValueAnimator valueAnimator8 = (ValueAnimator) AnimatorInflater.loadAnimator(contextB4, R.animator.passive_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator8.addUpdateListener(new fve(qqqVar4, 9, null));
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(valueAnimator7, valueAnimator8);
                animatorSet4.addListener(new hon(hnqVarA4, resourcesB3, contextB4));
                animatorSet4.addListener(new nln());
                return ojl.bg(animatorSet4);
            case 11:
                rwc rwcVar = (rwc) this.a.a();
                boolean zH = rwcVar.h();
                tzx tzxVar3 = this.d;
                tzx tzxVar4 = this.c;
                tzx tzxVar5 = this.b;
                if (zH) {
                    try {
                        our ourVar = (our) tzxVar4.a();
                        hpg hpgVar = new hpg((qla) tzxVar5.a(), (hoq) rwcVar.c(), TimeUnit.MICROSECONDS.convert(33333L, TimeUnit.MICROSECONDS), (ScheduledExecutorService) tzxVar3.a());
                        ourVar.d(hpgVar);
                        return rwc.j(hpgVar);
                    } catch (RuntimeException e) {
                        ((sgt) ((sgt) hor.a.b().i(e)).M((char) 1411)).s("Error trying to initialize audio");
                    }
                }
                return rvk.a;
            case 12:
                Integer num = (Integer) this.c.a();
                tzx tzxVar6 = this.d;
                Boolean boolA = ((hpc) this.a).a();
                pbnVar = (pbn) tzxVar6.a();
                boolean zBooleanValue3 = boolA.booleanValue();
                tzx tzxVar7 = this.b;
                if (!zBooleanValue3 || num.intValue() >= 0) {
                    sfmVar = sfd.a;
                } else {
                    try {
                        pbnVar.f("FRAMESTORE_MetadataModule#provideRequestTransformer");
                        sfmVar = new sfm((ojl) tzxVar7.a());
                    } finally {
                    }
                }
                sfmVar.getClass();
                return sfmVar;
            case 13:
                Integer num2 = (Integer) this.c.a();
                tzx tzxVar8 = this.d;
                Boolean boolA2 = ((hpc) this.a).a();
                pbnVar = (pbn) tzxVar8.a();
                boolean zBooleanValue4 = boolA2.booleanValue();
                tzx tzxVar9 = this.b;
                if (!zBooleanValue4 || num2.intValue() < 0) {
                    sfmVar2 = sfd.a;
                } else {
                    try {
                        pbnVar.f("FRAMESTORE_MetadataModule#provideRequestListener");
                        sfmVar2 = new sfm((ojl) tzxVar9.a());
                    } finally {
                    }
                }
                sfmVar2.getClass();
                return sfmVar2;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                owf owfVar = (owf) this.b.a();
                tzx tzxVar10 = this.c;
                fdq fdqVarA2 = ((ixw) this.a).a();
                Executor executor2 = (Executor) tzxVar10.a();
                rwc rwcVarB = ((jaf) this.d).b();
                scn scnVar = hrw.a;
                return new fpb(rwcVarB, owfVar, fdqVarA2, executor2, 4);
            case 15:
                tzx tzxVar11 = this.c;
                tzx tzxVar12 = this.a;
                owq owqVarB = ((imt) this.d).b();
                fdq fdqVarA3 = ((ixw) tzxVar12).a();
                out outVar = (out) tzxVar11.a();
                owf owfVar2 = (owf) this.b.a();
                outVar.getClass();
                owfVar2.getClass();
                return new hsr(owqVarB, fdqVarA3, outVar, owfVar2);
            case 16:
                tzs.b(this.b);
                gzi gziVar = gzq.a;
                return new hwa();
            case 17:
                return new hwq((Integer) this.d.a(), (Executor) this.a.a(), ((tzz) this.b).a(), (Set) this.c.a());
            case 18:
                return new hxx(tzs.b(this.a), this.c, (hfw) this.b.a(), (pbn) this.d.a());
            case 19:
                ((imm) this.b).b();
                gzi gziVar2 = gzs.a;
                return hgd.a;
            default:
                return new hzj((Set) this.c.a(), (pbn) this.d.a(), (gox) this.a.a(), (lat) this.b.a());
        }
    }

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[] bArr) {
        this.e = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[] cArr) {
        this.e = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[] cArr, byte[] bArr) {
        this.e = i;
        this.c = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
    }

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[] fArr) {
        this.e = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.b = tzxVar4;
    }

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[] iArr) {
        this.e = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, short[] sArr) {
        this.e = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
    }

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[][] bArr) {
        this.e = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.a = tzxVar3;
        this.c = tzxVar4;
    }

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[][] cArr) {
        this.e = i;
        this.b = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.a = tzxVar4;
    }

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[][] fArr) {
        this.e = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
    }

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, float[][][] fArr) {
        this.e = i;
        this.a = tzxVar;
        this.c = tzxVar2;
        this.b = tzxVar3;
        this.d = tzxVar4;
    }

    public hgv(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.d = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
        this.c = tzxVar4;
    }
}
