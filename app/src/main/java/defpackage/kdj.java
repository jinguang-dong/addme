package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.android.material.button.MaterialButton;
import com.google.ar.core.R;
import java.text.DecimalFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kdj implements ksd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kdj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kej] */
    @Override // defpackage.ksd
    public final void a(final ksa ksaVar, boolean z) {
        int i = this.b;
        if (i == 0) {
            rwc rwcVar = (rwc) this.a;
            if (rwcVar.h()) {
                rwcVar.c().b();
                return;
            }
            return;
        }
        if (i == 1) {
            final hjo hjoVar = (hjo) this.a;
            hjoVar.c.c(new Runnable() { // from class: hjn
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    String string;
                    String str;
                    final hjo hjoVar2 = hjoVar;
                    hjoVar2.e = ksaVar;
                    Context context = hjoVar2.a;
                    final FrameLayout frameLayout = new FrameLayout(context);
                    View.inflate(context, R.layout.retouching_bottom_sheet_title, frameLayout);
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    View.inflate(context, R.layout.retouching_bottom_sheet, frameLayout2);
                    FrameLayout frameLayout3 = (FrameLayout) frameLayout2.findViewById(R.id.example_images_view);
                    int i2 = 3;
                    final FrameLayout[] frameLayoutArr = new FrameLayout[3];
                    char c = 1;
                    char c2 = 2;
                    ksa[] ksaVarArr = {ksa.BEAUTIFICATION_OFF, ksa.BEAUTIFICATION_ON_LIGHT, ksa.BEAUTIFICATION_ON_STRONG};
                    int i3 = 0;
                    while (i3 < i2) {
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayoutArr[i3] = frameLayout4;
                        View.inflate(context, R.layout.retouching_examples, frameLayout4);
                        FrameLayout frameLayout5 = frameLayoutArr[i3];
                        ksa ksaVar2 = ksaVarArr[i3];
                        int i4 = i2;
                        EduImageView[] eduImageViewArr = new EduImageView[7];
                        char c3 = c2;
                        eduImageViewArr[0] = (EduImageView) frameLayout5.findViewById(R.id.retouching_edu_sample1);
                        eduImageViewArr[c] = (EduImageView) frameLayout5.findViewById(R.id.retouching_edu_sample2);
                        eduImageViewArr[c3] = (EduImageView) frameLayout5.findViewById(R.id.retouching_edu_sample3);
                        eduImageViewArr[i4] = (EduImageView) frameLayout5.findViewById(R.id.retouching_edu_sample4);
                        eduImageViewArr[4] = (EduImageView) frameLayout5.findViewById(R.id.retouching_edu_sample5);
                        eduImageViewArr[5] = (EduImageView) frameLayout5.findViewById(R.id.retouching_edu_sample6);
                        eduImageViewArr[6] = (EduImageView) frameLayout5.findViewById(R.id.retouching_edu_sample7);
                        int iOrdinal = ksaVar2.ordinal();
                        if (iOrdinal == 38) {
                            string = context.getResources().getString(R.string.retouching_edu_image_light_desc);
                            str = "_light.jpg";
                        } else if (iOrdinal != 40) {
                            string = context.getResources().getString(R.string.retouching_edu_image_strong_desc);
                            str = "_strong.jpg";
                        } else {
                            string = context.getResources().getString(R.string.retouching_edu_image_off_desc);
                            str = "_off.jpg";
                        }
                        int i5 = 0;
                        for (int i6 = 7; i5 < i6; i6 = 7) {
                            int i7 = i5 + 1;
                            eduImageViewArr[i5].c("https://www.gstatic.com/aiux/gca/faceretouching/img" + i7 + str, string);
                            i5 = i7;
                        }
                        frameLayout3.addView(frameLayoutArr[i3]);
                        if (hjoVar2.e == ksaVarArr[i3]) {
                            frameLayoutArr[i3].setVisibility(0);
                        } else {
                            frameLayoutArr[i3].setVisibility(8);
                        }
                        i3++;
                        i2 = i4;
                        c2 = c3;
                        c = 1;
                    }
                    final FrameLayout frameLayout6 = new FrameLayout(context);
                    View.inflate(context, R.layout.retouching_level_selector, frameLayout6);
                    final View viewFindViewById = frameLayout6.findViewById(R.id.retouching_edu_off);
                    final View viewFindViewById2 = frameLayout6.findViewById(R.id.retouching_edu_light);
                    final View viewFindViewById3 = frameLayout6.findViewById(R.id.retouching_edu_strong);
                    RippleDrawable rippleDrawable = (RippleDrawable) ((LinearLayout) frameLayout6.findViewById(R.id.level_selector)).getBackground();
                    if (rippleDrawable != null) {
                        rippleDrawable.setTint(qpt.au(R.dimen.gm3_sys_elevation_level2, context));
                        rippleDrawable.getDrawable(0).setTint(qpt.au(R.dimen.gm3_sys_elevation_level2, context));
                        rippleDrawable.getDrawable(1).setTint(qpt.au(R.dimen.gm3_sys_elevation_level2, context));
                    }
                    final TextView textView = (TextView) viewFindViewById.findViewById(R.id.retouching_edu_off_text);
                    final TextView textView2 = (TextView) viewFindViewById2.findViewById(R.id.retouching_edu_light_text);
                    final TextView textView3 = (TextView) viewFindViewById3.findViewById(R.id.retouching_edu_strong_text);
                    final ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.retouching_edu_off_icon);
                    final ImageView imageView2 = (ImageView) viewFindViewById2.findViewById(R.id.retouching_edu_light_icon);
                    final ImageView imageView3 = (ImageView) viewFindViewById3.findViewById(R.id.retouching_edu_strong_icon);
                    if (hjoVar2.f == -1) {
                        hjoVar2.f = textView.getCurrentTextColor();
                    }
                    final int iP = qpt.P(frameLayout6, R.attr.colorOnPrimaryContainer);
                    final int i8 = hjoVar2.f;
                    final int i9 = 1;
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: hjm
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i10 = i9;
                            if (i10 == 0) {
                                syj.i(view);
                                hjo hjoVar3 = hjoVar2;
                                hjoVar3.e = ksa.BEAUTIFICATION_ON_LIGHT;
                                View view2 = viewFindViewById3;
                                hjo.d(hjoVar3.e, viewFindViewById, viewFindViewById2, view2);
                                int i11 = i8;
                                int i12 = iP;
                                TextView textView4 = textView3;
                                hjo.c(hjoVar3.e, textView, textView2, textView4, i12, i11);
                                ImageView imageView4 = imageView3;
                                hjo.b(hjoVar3.e, imageView, imageView2, imageView4, i12, i11);
                                hjo.a(frameLayoutArr, hjoVar3.e);
                                return;
                            }
                            if (i10 != 1) {
                                syj.i(view);
                                hjo hjoVar4 = hjoVar2;
                                hjoVar4.e = ksa.BEAUTIFICATION_ON_STRONG;
                                View view3 = viewFindViewById3;
                                hjo.d(hjoVar4.e, viewFindViewById, viewFindViewById2, view3);
                                int i13 = i8;
                                int i14 = iP;
                                TextView textView5 = textView3;
                                hjo.c(hjoVar4.e, textView, textView2, textView5, i14, i13);
                                ImageView imageView5 = imageView3;
                                hjo.b(hjoVar4.e, imageView, imageView2, imageView5, i14, i13);
                                hjo.a(frameLayoutArr, hjoVar4.e);
                                return;
                            }
                            syj.i(view);
                            hjo hjoVar5 = hjoVar2;
                            hjoVar5.e = ksa.BEAUTIFICATION_OFF;
                            View view4 = viewFindViewById3;
                            hjo.d(hjoVar5.e, viewFindViewById, viewFindViewById2, view4);
                            int i15 = i8;
                            int i16 = iP;
                            TextView textView6 = textView3;
                            hjo.c(hjoVar5.e, textView, textView2, textView6, i16, i15);
                            ImageView imageView6 = imageView3;
                            hjo.b(hjoVar5.e, imageView, imageView2, imageView6, i16, i15);
                            hjo.a(frameLayoutArr, hjoVar5.e);
                        }
                    });
                    final int i10 = 0;
                    viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: hjm
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i102 = i10;
                            if (i102 == 0) {
                                syj.i(view);
                                hjo hjoVar3 = hjoVar2;
                                hjoVar3.e = ksa.BEAUTIFICATION_ON_LIGHT;
                                View view2 = viewFindViewById3;
                                hjo.d(hjoVar3.e, viewFindViewById, viewFindViewById2, view2);
                                int i11 = i8;
                                int i12 = iP;
                                TextView textView4 = textView3;
                                hjo.c(hjoVar3.e, textView, textView2, textView4, i12, i11);
                                ImageView imageView4 = imageView3;
                                hjo.b(hjoVar3.e, imageView, imageView2, imageView4, i12, i11);
                                hjo.a(frameLayoutArr, hjoVar3.e);
                                return;
                            }
                            if (i102 != 1) {
                                syj.i(view);
                                hjo hjoVar4 = hjoVar2;
                                hjoVar4.e = ksa.BEAUTIFICATION_ON_STRONG;
                                View view3 = viewFindViewById3;
                                hjo.d(hjoVar4.e, viewFindViewById, viewFindViewById2, view3);
                                int i13 = i8;
                                int i14 = iP;
                                TextView textView5 = textView3;
                                hjo.c(hjoVar4.e, textView, textView2, textView5, i14, i13);
                                ImageView imageView5 = imageView3;
                                hjo.b(hjoVar4.e, imageView, imageView2, imageView5, i14, i13);
                                hjo.a(frameLayoutArr, hjoVar4.e);
                                return;
                            }
                            syj.i(view);
                            hjo hjoVar5 = hjoVar2;
                            hjoVar5.e = ksa.BEAUTIFICATION_OFF;
                            View view4 = viewFindViewById3;
                            hjo.d(hjoVar5.e, viewFindViewById, viewFindViewById2, view4);
                            int i15 = i8;
                            int i16 = iP;
                            TextView textView6 = textView3;
                            hjo.c(hjoVar5.e, textView, textView2, textView6, i16, i15);
                            ImageView imageView6 = imageView3;
                            hjo.b(hjoVar5.e, imageView, imageView2, imageView6, i16, i15);
                            hjo.a(frameLayoutArr, hjoVar5.e);
                        }
                    });
                    final int i11 = 2;
                    viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: hjm
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i102 = i11;
                            if (i102 == 0) {
                                syj.i(view);
                                hjo hjoVar3 = hjoVar2;
                                hjoVar3.e = ksa.BEAUTIFICATION_ON_LIGHT;
                                View view2 = viewFindViewById3;
                                hjo.d(hjoVar3.e, viewFindViewById, viewFindViewById2, view2);
                                int i112 = i8;
                                int i12 = iP;
                                TextView textView4 = textView3;
                                hjo.c(hjoVar3.e, textView, textView2, textView4, i12, i112);
                                ImageView imageView4 = imageView3;
                                hjo.b(hjoVar3.e, imageView, imageView2, imageView4, i12, i112);
                                hjo.a(frameLayoutArr, hjoVar3.e);
                                return;
                            }
                            if (i102 != 1) {
                                syj.i(view);
                                hjo hjoVar4 = hjoVar2;
                                hjoVar4.e = ksa.BEAUTIFICATION_ON_STRONG;
                                View view3 = viewFindViewById3;
                                hjo.d(hjoVar4.e, viewFindViewById, viewFindViewById2, view3);
                                int i13 = i8;
                                int i14 = iP;
                                TextView textView5 = textView3;
                                hjo.c(hjoVar4.e, textView, textView2, textView5, i14, i13);
                                ImageView imageView5 = imageView3;
                                hjo.b(hjoVar4.e, imageView, imageView2, imageView5, i14, i13);
                                hjo.a(frameLayoutArr, hjoVar4.e);
                                return;
                            }
                            syj.i(view);
                            hjo hjoVar5 = hjoVar2;
                            hjoVar5.e = ksa.BEAUTIFICATION_OFF;
                            View view4 = viewFindViewById3;
                            hjo.d(hjoVar5.e, viewFindViewById, viewFindViewById2, view4);
                            int i15 = i8;
                            int i16 = iP;
                            TextView textView6 = textView3;
                            hjo.c(hjoVar5.e, textView, textView2, textView6, i16, i15);
                            ImageView imageView6 = imageView3;
                            hjo.b(hjoVar5.e, imageView, imageView2, imageView6, i16, i15);
                            hjo.a(frameLayoutArr, hjoVar5.e);
                        }
                    });
                    hjo.d(hjoVar2.e, viewFindViewById, viewFindViewById2, viewFindViewById3);
                    hjo.c(hjoVar2.e, textView, textView2, textView3, iP, i8);
                    hjo.b(hjoVar2.e, imageView, imageView2, imageView3, iP, i8);
                    frameLayout2.findViewById(R.id.apply_button).setOnClickListener(new fvr(hjoVar2, 14));
                    mni mniVar = hjoVar2.b;
                    final View viewFindViewById4 = frameLayout.findViewById(R.id.retouching_sheet_title);
                    final ViewGroup viewGroup = (ViewGroup) frameLayout.findViewById(R.id.title_level_selector);
                    final ViewGroup viewGroup2 = (ViewGroup) frameLayout2.findViewById(R.id.content_level_selector);
                    viewGroup2.addView(frameLayout6);
                    mniVar.e = new View.OnScrollChangeListener() { // from class: hjl
                        @Override // android.view.View.OnScrollChangeListener
                        public final void onScrollChange(View view, int i12, int i13, int i14, int i15) {
                            View view2 = frameLayout;
                            int[] iArr = new int[2];
                            int[] iArr2 = new int[2];
                            view2.getLocationInWindow(iArr);
                            ViewGroup viewGroup3 = viewGroup2;
                            viewGroup3.getLocationInWindow(iArr2);
                            int i16 = iArr2[1];
                            int height = iArr[1] + view2.getHeight();
                            ViewGroup viewGroup4 = viewGroup;
                            View view3 = frameLayout6;
                            View view4 = viewFindViewById4;
                            if (i16 < height) {
                                if (viewGroup3.findViewById(R.id.level_selector) != null) {
                                    viewGroup3.removeView(view3);
                                    viewGroup4.addView(view3);
                                }
                                view4.setVisibility(4);
                                return;
                            }
                            if (viewGroup4.findViewById(R.id.level_selector) != null) {
                                viewGroup4.removeView(view3);
                                viewGroup3.addView(view3);
                            }
                            view4.setVisibility(0);
                        }
                    };
                    if (mniVar.l.p(gzo.aO)) {
                        return;
                    }
                    mniVar.a.execute(new lqd((Object) mniVar, (Object) frameLayout, (Object) frameLayout2, 12, (byte[]) null));
                    mniVar.j = 5;
                    mniVar.g = System.currentTimeMillis();
                    mniVar.m = snz.a.m();
                    mniVar.n = null;
                }
            });
            return;
        }
        if (i == 2) {
            sgv sgvVar = ktb.a;
            ((mnm) this.a).a();
            return;
        }
        if (i == 3) {
            sgv sgvVar2 = ktb.a;
            rwc rwcVar2 = (rwc) this.a;
            if (rwcVar2.h()) {
                if (z) {
                    ((kcn) rwcVar2.c()).a();
                    return;
                }
                kcn kcnVar = (kcn) rwcVar2.c();
                int i2 = 0;
                if (kcnVar.e == null) {
                    Context context = kcnVar.b;
                    kcnVar.e = new FrameLayout(context);
                    View viewInflate = View.inflate(context, R.layout.nightlapse_disabled_bottomsheet, kcnVar.e);
                    TextView textView = (TextView) viewInflate.findViewById(R.id.not_available_description);
                    float fFloatValue = ((Float) kcnVar.f.e(haw.u).orElse(Float.valueOf(0.0f))).floatValue();
                    textView.setText(fFloatValue > 0.0f ? context.getResources().getString(R.string.nightlapse_not_available_description_zoom_and_speed, new DecimalFormat("#.#").format(fFloatValue)) : context.getResources().getString(R.string.nightlapse_not_available_description_speed));
                    ((MaterialButton) viewInflate.findViewById(R.id.learn_more_button)).setOnClickListener(new kcm(kcnVar, i2));
                }
                kcnVar.c.set(false);
                kcnVar.a.m(28, R.string.nightlapse_not_available_title, kcnVar.e);
                return;
            }
            return;
        }
        if (i == 4) {
            ((pez) this.a).f();
            return;
        }
        ?? r7 = this.a;
        if (((rwc) r7.a()).h()) {
            if (z) {
                ((mgz) ((rwc) r7.a()).c()).a();
                return;
            }
            mgz mgzVar = (mgz) ((rwc) r7.a()).c();
            if (mgzVar.e == null || mgzVar.c.dL() != mgzVar.f) {
                Context context2 = mgzVar.a;
                FrameLayout frameLayout = new FrameLayout(context2);
                View viewInflate2 = View.inflate(context2, R.layout.macro_focus_disabled_bottomsheet, frameLayout);
                TextView textView2 = (TextView) viewInflate2.findViewById(R.id.not_available_description);
                owq owqVar = mgzVar.c;
                textView2.setText(((nkw) owqVar.dL()).equals(nkw.VIDEO) ? R.string.macro_focus_not_available_description_video_mode : mgzVar.d ? R.string.macro_focus_not_available_description_with_pro_mode : R.string.macro_focus_not_available_description);
                ((MaterialButton) viewInflate2.findViewById(R.id.learn_more_button)).setOnClickListener(new kcm(mgzVar, 19));
                mgzVar.e = frameLayout;
                mgzVar.f = (nkw) owqVar.dL();
            }
            mgzVar.b.m(16, R.string.macro_focus_not_available_title, mgzVar.e);
        }
    }
}
