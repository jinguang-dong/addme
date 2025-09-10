package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mlg implements jhh, jgw, jhf, jhg, jfv, jft {
    public final Activity a;
    public final owq b;
    public dv c;
    public final ksf d = new mlf(this, 0);
    public final iyu e;
    public final krj f;
    public final fdy g;
    public final luj h;
    public final hbj i;
    public final kgn j;
    private final mlm k;
    private final owq l;
    private final boolean m;
    private final out n;
    private final lpd o;
    private final luj p;
    private final ocq q;
    private final ocq r;

    public mlg(Activity activity, iyu iyuVar, ocq ocqVar, mlm mlmVar, owq owqVar, owq owqVar2, jgt jgtVar, boolean z, hbj hbjVar, out outVar, krj krjVar, fdy fdyVar, luj lujVar, luj lujVar2, kgn kgnVar, lpd lpdVar, ocq ocqVar2) {
        this.a = activity;
        this.e = iyuVar;
        this.r = ocqVar;
        this.k = mlmVar;
        this.b = owqVar;
        this.l = owqVar2;
        this.m = z;
        this.i = hbjVar;
        this.n = outVar;
        this.f = krjVar;
        this.g = fdyVar;
        this.h = lujVar;
        this.p = lujVar2;
        this.j = kgnVar;
        this.o = lpdVar;
        this.q = ocqVar2;
        outVar.c(new lor(this, jgtVar, 8, (char[]) null));
    }

    private final void c() {
        hbj hbjVar = this.i;
        if (!hbjVar.p(gzo.aS) || hbjVar.p(gzo.aO) || this.o.a || this.q.r()) {
            return;
        }
        Activity activity = this.a;
        luj lujVar = this.h;
        Intent intent = activity.getIntent();
        lus lusVar = luf.i;
        int iIntValue = ((Integer) lujVar.b(lusVar)).intValue();
        Integer num = (Integer) hbjVar.a(gzo.r).get();
        int iIntValue2 = num.intValue();
        if (iIntValue >= iIntValue2 || fdo.h(intent)) {
            this.p.d(lusVar, num);
            return;
        }
        if (iIntValue == iIntValue2 - 1) {
            ocq ocqVar = this.r;
            out.a();
            out.a();
            Object obj = ocqVar.a;
            mli mliVar = (mli) obj;
            if (mliVar.f == null) {
                Context context = mliVar.b;
                FrameLayout frameLayout = new FrameLayout(context);
                View.inflate(context, R.layout.double_tap_bottom_sheet, frameLayout);
                ((Button) frameLayout.findViewById(R.id.got_it_button)).setOnClickListener(new mlk(obj, 1));
                Object obj2 = efm.c(context, true != mliVar.d.k() ? R.raw.double_tap_phone_edu_animation : R.raw.double_tap_tablet_edu_animation).a;
                obj2.getClass();
                efs efsVar = mliVar.e;
                efsVar.v((efh) obj2);
                efsVar.t(-1);
                FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.bottom_sheet_video_container);
                EduImageView eduImageView = (EduImageView) frameLayout.findViewById(R.id.bottom_sheet_video);
                ViewGroup.LayoutParams layoutParams = eduImageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                DisplayMetrics displayMetrics = mliVar.c;
                int i = (displayMetrics.widthPixels - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                int i2 = (displayMetrics.heightPixels - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
                float f = i;
                if (layoutParams.width > f) {
                    layoutParams.width = (int) f;
                    layoutParams.height = (int) ((layoutParams.height / layoutParams.width) * f);
                    eduImageView.setLayoutParams(layoutParams);
                } else {
                    float f2 = i2;
                    if (layoutParams.height > f2) {
                        marginLayoutParams.width = (int) ((layoutParams.width / layoutParams.height) * f2);
                        marginLayoutParams.height = (int) f2;
                        eduImageView.setLayoutParams(layoutParams);
                    }
                }
                eduImageView.b(efsVar, context.getString(R.string.double_tap_launch_content_description));
                mliVar.f = frameLayout;
            }
            mliVar.e.n();
            mni mniVar = mliVar.a;
            View view = mliVar.f;
            view.getClass();
            mniVar.m(8, R.string.double_tap_launch_title, view);
        }
        this.p.d(lusVar, Integer.valueOf(iIntValue + 1));
    }

    public final void a() {
        dv dvVar;
        if (this.a.isFinishing() || (dvVar = this.c) == null) {
            return;
        }
        dvVar.show();
    }

    public final void b() {
        if (this.i.p(gzo.aO) || this.m) {
            this.b.a(true);
            this.l.a(true);
            return;
        }
        nkw nkwVar = this.e.p;
        if (nkwVar == null || nkwVar.equals(nkw.IMAGE_INTENT) || nkwVar.equals(nkw.VIDEO_INTENT)) {
            return;
        }
        if (!((Boolean) this.b.dL()).booleanValue()) {
            this.n.c(new mjh(this, 16));
            return;
        }
        Activity activity = this.a;
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.activity_root_view);
        activity.getResources();
        mlm mlmVar = this.k;
        if (((Boolean) mlmVar.b.dL()).booleanValue()) {
            owq owqVar = mlmVar.c;
            if (((Boolean) owqVar.dL()).booleanValue()) {
                return;
            }
            if (((Boolean) mlmVar.d.dL()).booleanValue()) {
                owqVar.a(true);
                return;
            }
            imi imiVar = mlmVar.e;
            mld mldVar = new mld();
            mldVar.b = viewGroup;
            mldVar.a = mlm.a;
            mldVar.j = imiVar;
            mldVar.h = 4;
            mldVar.e = true;
            mldVar.i = mlmVar.f;
            mldVar.k = mlmVar.g;
            imiVar.a(mldVar.a());
            owqVar.a(true);
        }
    }

    @Override // defpackage.jhf
    public final void ej() {
        if (this.c != null) {
            b();
        }
    }

    @Override // defpackage.jhg
    public final void eu() {
        dv dvVar = this.c;
        if (dvVar != null) {
            dvVar.dismiss();
            this.c = null;
        }
        ocq ocqVar = this.r;
        out.a();
        ((mli) ocqVar.a).a();
    }

    @Override // defpackage.jft
    public final void j(Configuration configuration) {
        dv dvVar = this.c;
        if (dvVar != null) {
            dvVar.dismiss();
            this.c = null;
            b();
        }
    }

    @Override // defpackage.jfv
    public final void m(Intent intent) {
        c();
    }

    @Override // defpackage.jgw
    public final void w() {
        c();
    }
}
