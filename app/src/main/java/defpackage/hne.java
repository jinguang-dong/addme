package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hne {
    public static final sgv a = sgv.g("hne");
    public final Context b;
    public final boolean c;
    public final tzj d;
    public final nnk e;
    public final FilmstripTransitionLayout f;
    public final moc g;
    public final ThumbnailView h;
    public final tzj i;
    public final Activity j;
    public final out k;
    public final hbc l;
    public lpz n;
    public final luj p;
    public final cxb q;
    public final cxb r;
    private final mpf s;
    private final hbd t;
    private final lsl u;
    private final fdr v;
    private final owf w;
    private final mdy x;
    public syu m = ske.M(Boolean.FALSE);
    public Optional o = Optional.empty();

    public hne(Context context, boolean z, tzj tzjVar, mpf mpfVar, hbd hbdVar, cxb cxbVar, lsl lslVar, mdy mdyVar, Activity activity, out outVar, nnk nnkVar, mwq mwqVar, moc mocVar, tzj tzjVar2, cxb cxbVar2, fdr fdrVar, luj lujVar, owf owfVar, hbj hbjVar, hbc hbcVar) {
        this.b = context;
        this.c = z;
        this.d = tzjVar;
        this.s = mpfVar;
        this.t = hbdVar;
        this.q = cxbVar;
        this.u = lslVar;
        this.x = mdyVar;
        this.k = outVar;
        this.v = fdrVar;
        this.j = activity;
        this.e = nnkVar;
        FilmstripTransitionLayout filmstripTransitionLayout = (FilmstripTransitionLayout) ((ocq) mwqVar.b).c(R.id.filmstrip_transition_layout);
        this.f = filmstripTransitionLayout;
        this.h = (ThumbnailView) ((ocq) mwqVar.b).c(R.id.thumbnail_button);
        this.g = mocVar;
        this.i = tzjVar2;
        this.r = cxbVar2;
        this.p = lujVar;
        filmstripTransitionLayout.g = owfVar;
        filmstripTransitionLayout.j = hbjVar;
        filmstripTransitionLayout.h = nnkVar;
        this.w = owfVar;
        this.l = hbcVar;
    }

    public final syu a() {
        Intent intentD = ezh.d(this.c, true, this.j.isVoiceInteractionRoot(), new long[0]);
        intentD.setData(ral.a);
        lpz lpzVar = this.n;
        if (lpzVar != null) {
            lpzVar.p();
        }
        return e(intentD, this.h, this.g.a());
    }

    public final syu b() {
        String str;
        fqb fqbVar;
        long[] jArr;
        String str2;
        int i;
        rnt.L(!this.m.isDone());
        hbw hbwVar = (hbw) this.d.a();
        Iterator it = hbwVar.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                fqbVar = null;
                break;
            }
            fqbVar = (fqb) it.next();
            fqbVar.getClass();
            if (!fqbVar.a().k()) {
                break;
            }
            ltd ltdVarD = fqbVar.a().d();
            String.format(Locale.ROOT, "Null ShotId encountered for item: %s", fqbVar.a());
            ltdVarD.getClass();
            if (!this.u.a.contains(ltdVarD)) {
                break;
            }
        }
        if (fqbVar == null) {
            return ske.L(new CancellationException("Filmstrip item adapter is empty"));
        }
        boolean zBooleanValue = ((Boolean) this.p.b(luf.aN)).booleanValue();
        if (zBooleanValue || this.c) {
            hbwVar.a();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hbwVar.iterator();
            while (it2.hasNext()) {
                fqb fqbVar2 = (fqb) it2.next();
                sbp sbpVarF = fqbVar2.a().f();
                if (sbpVarF.isEmpty()) {
                    arrayList.add(Long.valueOf(fqbVar2.a().b()));
                } else {
                    int size = sbpVarF.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Long l = (Long) sbpVarF.get(i2);
                        if (l.longValue() != -1) {
                            arrayList.add(l);
                        }
                    }
                }
            }
            Object[] array = arrayList.toArray();
            int length = array.length;
            long[] jArr2 = new long[length];
            for (int i3 = 0; i3 < length; i3++) {
                Object obj = array[i3];
                obj.getClass();
                jArr2[i3] = ((Number) obj).longValue();
            }
            arrayList.size();
            Arrays.toString(jArr2);
            jArr = jArr2;
        } else {
            jArr = new long[0];
        }
        Intent intentD = ezh.d(this.c, zBooleanValue, this.j.isVoiceInteractionRoot(), jArr);
        mdy mdyVar = this.x;
        long j = mdyVar.e;
        rnt.D(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        if (j == 0) {
            str2 = "0";
        } else if (j > 0) {
            str2 = Long.toString(j, 10);
        } else {
            long j2 = (j >>> 1) / 5;
            char[] cArr = new char[64];
            int i4 = 63;
            cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
            for (long j3 = 0; j2 > j3; j3 = 0) {
                i4--;
                cArr[i4] = Character.forDigit((int) (j2 % 10), 10);
                j2 /= 10;
            }
            str2 = new String(cArr, i4, 64 - i4);
        }
        intentD.putExtra("external_session_id", str2);
        jls jlsVarC = fqbVar.c();
        ltf ltfVar = jlsVarC == null ? ltf.UNKNOWN : jlsVarC.f ? ltf.PANORAMA : jlsVarC.g ? ltf.PHOTOSPHERE : (jlsVarC.e <= 0 || jlsVarC.b <= 0 || jlsVarC.c <= 0 || jlsVarC.d.length() <= 0) ? ltf.UNKNOWN : ltf.VIDEO;
        fqc fqcVarA = fqbVar.a();
        if (zBooleanValue || !fqcVarA.k() || fqcVarA.d() == null) {
            rnt.M(!fqcVarA.c().equals(Uri.EMPTY), "Item is no longer in progress but data doesn't have a valid URI.");
            intentD.setData(fqcVarA.c());
        } else {
            lsl lslVar = this.u;
            ltd ltdVarD2 = fqcVarA.d();
            ltdVarD2.getClass();
            lsy lsyVar = (lsy) lslVar.b.get(ltdVarD2);
            if (lsyVar != null) {
                ltfVar = lsyVar.c;
            }
            Uri uriC = lsyVar != null ? lsyVar.b : fqbVar.a().c();
            intentD.setDataAndType(uriC, ppo.c.j);
            intentD.putExtra("processing_uri_intent_extra", new Uri.Builder().scheme("content").authority(this.t.e).appendPath("processing").appendPath(uriC.getLastPathSegment()).build());
        }
        PackageInfo packageInfoA = this.e.a();
        if (packageInfoA != null) {
            str = packageInfoA.versionName;
            i = packageInfoA.versionCode;
        } else {
            i = 0;
        }
        boolean zK = fqbVar.a().k();
        tpc tpcVarM = srh.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        srh srhVar = (srh) tphVar;
        str2.getClass();
        srhVar.b |= 1;
        srhVar.c = str2;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        srh srhVar2 = (srh) tpcVarM.b;
        srhVar2.b |= 2;
        srhVar2.d = zK;
        switch (ltfVar.ordinal()) {
            case 1:
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srh srhVar3 = (srh) tpcVarM.b;
                srhVar3.e = 1;
                srhVar3.b |= 4;
                break;
            case 2:
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srh srhVar4 = (srh) tpcVarM.b;
                srhVar4.e = 2;
                srhVar4.b |= 4;
                break;
            case 3:
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srh srhVar5 = (srh) tpcVarM.b;
                srhVar5.e = 3;
                srhVar5.b |= 4;
                break;
            case 4:
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srh srhVar6 = (srh) tpcVarM.b;
                srhVar6.e = 31;
                srhVar6.b |= 4;
                break;
            case 5:
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srh srhVar7 = (srh) tpcVarM.b;
                srhVar7.e = 20;
                srhVar7.b |= 4;
                break;
            case 6:
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srh srhVar8 = (srh) tpcVarM.b;
                srhVar8.e = 20;
                srhVar8.b |= 4;
                break;
            case 7:
            case 8:
            default:
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srh srhVar9 = (srh) tpcVarM.b;
                srhVar9.e = 0;
                srhVar9.b |= 4;
                break;
            case 9:
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srh srhVar10 = (srh) tpcVarM.b;
                srhVar10.e = 10;
                srhVar10.b |= 4;
                break;
            case 10:
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srh srhVar11 = (srh) tpcVarM.b;
                srhVar11.e = 32;
                srhVar11.b |= 4;
                break;
        }
        if (str != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            srh srhVar12 = (srh) tpcVarM.b;
            srhVar12.b |= 8;
            srhVar12.f = str;
        }
        if (i != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            srh srhVar13 = (srh) tpcVarM.b;
            srhVar13.b |= 16;
            srhVar13.g = i;
        }
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.LAUNCH_PHOTOS_REVIEW_EVENT;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar2 = tpcVarM2.b;
        sod sodVar = (sod) tphVar2;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar2.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        srh srhVar14 = (srh) tpcVarM.l();
        srhVar14.getClass();
        sodVar2.C = srhVar14;
        sodVar2.c = 1 | sodVar2.c;
        mdyVar.I(tpcVarM2);
        return e(intentD, this.h, this.g.a());
    }

    public final syu c() {
        rnt.L(!this.m.isDone());
        tzj tzjVar = this.d;
        if (!((hbw) tzjVar.a()).u()) {
            return b();
        }
        final szh szhVar = new szh();
        ((hbw) tzjVar.a()).q().c(new Runnable() { // from class: hnb
            /* JADX WARN: Type inference failed for: r1v12, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r1v15, types: [sgt, shi] */
            @Override // java.lang.Runnable
            public final void run() {
                hne hneVar = this.a;
                boolean zIsDone = hneVar.m.isDone();
                szh szhVar2 = szhVar;
                if (zIsDone) {
                    CancellationException cancellationException = new CancellationException("Photos Launch was already cancelled.");
                    ((sgt) ((sgt) hne.a.c().i(cancellationException)).M((char) 1385)).s("launchPhotos");
                    szhVar2.a(cancellationException);
                } else if (!((hbw) hneVar.d.a()).u()) {
                    szhVar2.f(hneVar.b());
                } else {
                    if (((Boolean) hneVar.p.b(luf.aN)).booleanValue()) {
                        szhVar2.f(hneVar.a());
                        return;
                    }
                    CancellationException cancellationException2 = new CancellationException("filmstrip item was null");
                    ((sgt) ((sgt) hne.a.b().i(cancellationException2)).M((char) 1384)).s("launchPhotos");
                    szhVar2.a(cancellationException2);
                }
            }
        }, this.k);
        return szhVar;
    }

    public final boolean d() {
        if (!this.m.isDone()) {
            return true;
        }
        Boolean bool = (Boolean) ojl.ci(this.m);
        rnt.x(bool);
        return bool.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.os.Parcelable, java.lang.Object] */
    private final syu e(Intent intent, View view, Bitmap bitmap) throws Resources.NotFoundException {
        if (intent.resolveActivity(this.b.getPackageManager()) == null) {
            ((hna) this.i.a()).eb();
            view.setVisibility(0);
            return ske.L(new CancellationException("Photos is disabled."));
        }
        this.s.e();
        this.v.a = ssc.FILMSTRIP;
        Long lD = this.g.d();
        if (lD != null) {
            intent.putExtra("photos_review_launch_timestamp", lD.longValue());
        }
        intent.putExtra("shared_element_return_transition", true);
        Activity activity = this.j;
        intent.putExtra(OPuAVreQM.AAjtTiXORu, activity.getResources().getDimension(R.dimen.rounded_thumbnail_diameter_normal));
        if (this.f.c()) {
            intent.putExtra("photos_review_foldable_hinge_rect", (Parcelable) ((muj) this.w.dL()).a.c());
        }
        if (this.e.b("6.12")) {
            if (bitmap != null) {
                activity.setExitSharedElementCallback(new hnd(bitmap));
                intent.putExtra("use_shared_element_snapshot_for_thumbnail", true);
            }
            ActivityOptions activityOptionsMakeSceneTransitionAnimation = ActivityOptions.makeSceneTransitionAnimation(activity, view, "photos:filmstrip_transition_view");
            cxb cxbVar = this.q;
            Bundle bundle = activityOptionsMakeSceneTransitionAnimation.toBundle();
            bundle.getClass();
            ((Activity) cxbVar.a).startActivityForResult(intent, 0, bundle);
        } else {
            Activity activity2 = (Activity) this.q.a;
            activity2.startActivityForResult(intent, 0);
            activity2.overridePendingTransition(R.anim.photos_transition_noanim, R.anim.photos_transition_noanim);
        }
        return ske.M(Boolean.TRUE);
    }
}
