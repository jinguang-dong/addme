package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ar.core.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kto extends ConstraintLayout {
    public static final sgv i = sgv.g("kto");
    private final ksd A;
    private final mwq B;
    public final Map j;
    public final krq k;
    public final Context l;
    public final int m;
    public final ksc n;
    public final ksb o;
    public ksa p;
    private final ArrayList q;
    private final Map r;
    private final TextView s;
    private final TextView t;
    private final LinearLayout u;
    private final ImageView v;
    private final Space w;
    private final boolean x;
    private final boolean y;
    private final boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    public kto(Context context, krq krqVar, ksa ksaVar, ksc kscVar, ksd ksdVar, ksb ksbVar, int i2, boolean z, mwq mwqVar) {
        super(context);
        this.k = krqVar;
        this.p = ksaVar;
        this.l = context;
        this.n = kscVar;
        this.A = ksdVar;
        this.o = ksbVar;
        this.m = i2;
        this.x = z;
        boolean z2 = ksdVar != null;
        this.y = z2;
        this.B = mwqVar;
        this.q = new ArrayList();
        this.j = new HashMap();
        this.r = new HashMap();
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setId(View.generateViewId());
        TextView textView2 = new TextView(context);
        this.t = textView2;
        textView2.setId(View.generateViewId());
        LinearLayout linearLayout = new LinearLayout(context);
        this.u = linearLayout;
        linearLayout.setId(View.generateViewId());
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        imageView.setId(View.generateViewId());
        if (z2) {
            Space space = new Space(context);
            this.w = space;
            space.setId(View.generateViewId());
        } else {
            this.w = null;
        }
        if (context instanceof fdi) {
            this.z = ((fdi) context).b().p(gzo.bw);
        } else {
            this.z = false;
        }
    }

    private final void m(String str, String str2) {
        TextView textView = this.t;
        textView.setText(str);
        textView.setContentDescription(str2);
        Space space = this.w;
        if (space != null) {
            space.setContentDescription(str2);
        }
    }

    private final void n(ImageButton imageButton, boolean z) {
        int i2 = R.drawable.value_icon_background;
        if (z) {
            imageButton.setBackgroundResource(R.drawable.value_icon_background);
            return;
        }
        if (true == this.z) {
            i2 = R.drawable.value_icon_unselected_background;
        }
        imageButton.setBackgroundResource(i2);
    }

    public final krs g() {
        return this.k.a;
    }

    public final void h(String str) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageButton imageButton = (ImageButton) ((FrameLayout) arrayList.get(i2)).getChildAt(0);
            imageButton.setEnabled(false);
            imageButton.setImageAlpha(76);
        }
        ImageButton imageButton2 = (ImageButton) this.j.get(this.p);
        if (imageButton2 != null) {
            imageButton2.setSelected(false);
        }
        if (TextUtils.isEmpty(str)) {
            m(getResources().getString(R.string.options_menu_disabled), getResources().getString(R.string.options_menu_disabled_desc));
        } else {
            m(str, str);
        }
        this.t.setTextColor(ojl.aM(this));
    }

    public final void i(ksa ksaVar) {
        Map map = this.j;
        ImageButton imageButton = (ImageButton) map.get(ksaVar);
        if (imageButton == null) {
            ((sgt) i.c().M(3439)).E("disableOption: nonexistent option %s for category %s", ksaVar, g());
        } else if (imageButton != ((ImageButton) map.get(this.p))) {
            imageButton.setEnabled(false);
            imageButton.setImageAlpha(76);
        }
    }

    public final void j() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageButton imageButton = (ImageButton) ((FrameLayout) arrayList.get(i2)).getChildAt(0);
            imageButton.setEnabled(true);
            imageButton.setImageAlpha(255);
        }
        ImageButton imageButton2 = (ImageButton) this.j.get(this.p);
        if (imageButton2 != null) {
            imageButton2.setSelected(true);
            krr krrVar = (krr) this.r.get(imageButton2);
            krrVar.getClass();
            m(krrVar.c, krrVar.d);
            this.t.setTextColor(ojl.aO(this));
        }
    }

    public final void k() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i2;
        krr krrVar;
        int i3;
        int dimensionPixelSize;
        int i4 = 0;
        int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[0]};
        boolean z = this.z;
        ColorStateList colorStateList = new ColorStateList(iArr, z ? new int[]{ojl.aO(this), this.x ? 0 : qpt.P(this, R.attr.colorSurfaceContainer)} : new int[]{ojl.aO(this), this.x ? 0 : qpt.P(this, R.attr.colorSurfaceContainerHigh)});
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{ojl.aJ(this), ojl.aL(this)});
        krq krqVar = this.k;
        sbp sbpVar = krqVar.d;
        for (int size = sbpVar.size() - 1; size >= 0; size--) {
            Context context = this.l;
            ImageButton imageButton = new ImageButton(context);
            imageButton.setId(View.generateViewId());
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(imageButton, new ckl(-1, -1));
            frameLayout.setId(View.generateViewId());
            this.q.add(frameLayout);
        }
        cku ckuVar = new cku();
        ckuVar.g(this);
        boolean z2 = this.x;
        if (z2) {
            i2 = R.dimen.bottom_panel_title_horizontal_margin;
        } else {
            TextView textView = this.s;
            textView.setText(krqVar.b);
            textView.setContentDescription(getResources().getString(krqVar.c));
            textView.setTextAppearance(z ? ojl.aU(getContext(), R.attr.textAppearanceLabelMedium) : ojl.aU(getContext(), R.attr.textAppearanceCaption));
            textView.setTypeface(getResources().getFont(R.font.google_sans));
            textView.setTextColor(z ? ojl.aL(this) : ojl.aI(this));
            textView.setTextDirection(5);
            ckuVar.j(textView.getId(), 6, 0, 6, z ? getResources().getDimensionPixelSize(R.dimen.bottom_panel_title_horizontal_margin) : getResources().getDimensionPixelSize(R.dimen.options_menu_label_margin_left));
            ckuVar.j(textView.getId(), 3, 0, 3, z ? getResources().getDimensionPixelSize(R.dimen.options_menu_label_margin_top) : getResources().getDimensionPixelSize(R.dimen.options_menu_label_margin_top_legacy));
            if (sbpVar.size() < 5) {
                int id = textView.getId();
                ArrayList arrayList = this.q;
                ckuVar.j(id, 7, ((FrameLayout) arrayList.get(0)).getId(), 6, getResources().getDimensionPixelSize(R.dimen.options_menu_button_margin_left));
                ckuVar.j(this.u.getId(), 7, ((FrameLayout) arrayList.get(0)).getId(), 6, getResources().getDimensionPixelSize(R.dimen.options_menu_button_margin_left));
            } else {
                ckuVar.j(textView.getId(), 7, ((FrameLayout) this.q.get(sbpVar.size() - 3)).getId(), 6, getResources().getDimensionPixelSize(R.dimen.options_menu_button_margin_left));
            }
            ckuVar.k(textView.getId(), -2);
            ckuVar.l(textView.getId(), 0);
            addView(textView);
            int size2 = sbpVar.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    krrVar = null;
                    break;
                }
                krrVar = (krr) sbpVar.get(i5);
                i5++;
                if (krrVar.a == this.p) {
                    break;
                }
            }
            if (krrVar != null) {
                m(krrVar.c, krrVar.d);
            }
            TextView textView2 = this.t;
            textView2.setTextAppearance(z ? ojl.aU(getContext(), R.attr.textAppearanceTitleMediumEmphasized) : ojl.aU(getContext(), R.attr.textAppearanceSubhead1));
            textView2.setTypeface(getResources().getFont(R.font.google_sans));
            textView2.setTextColor(ojl.aO(this));
            textView2.setTextDirection(5);
            LinearLayout linearLayout = this.u;
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            linearLayout.addView(textView2, layoutParams);
            if (this.y) {
                Drawable drawable = this.l.getDrawable(R.drawable.help_outline);
                if (drawable != null) {
                    drawable.setTint(ojl.aO(this));
                }
                ImageView imageView = this.v;
                imageView.setImageDrawable(drawable);
                imageView.setBackgroundColor(0);
                imageView.setPadding(getResources().getDimensionPixelSize(R.dimen.help_outline_padding_left), 0, 0, 0);
                linearLayout.addView(imageView, layoutParams);
                Space space = this.w;
                space.getClass();
                addView(space);
                ckuVar.i(space.getId(), 6, 0, 6);
                ckuVar.i(space.getId(), 7, linearLayout.getId(), 7);
                ckuVar.i(space.getId(), 3, 0, 3);
                ckuVar.i(space.getId(), 4, 0, 4);
                space.setOnClickListener(new ktm(this, this.A, i4));
                space.setAccessibilityDelegate(new ktn(this));
            }
            ckuVar.k(linearLayout.getId(), -2);
            ckuVar.l(linearLayout.getId(), 0);
            int id2 = linearLayout.getId();
            if (z) {
                Resources resources = getResources();
                i3 = R.dimen.bottom_panel_title_horizontal_margin;
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.bottom_panel_title_horizontal_margin);
            } else {
                i3 = R.dimen.bottom_panel_title_horizontal_margin;
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.options_menu_label_margin_left);
            }
            int i6 = dimensionPixelSize;
            i2 = i3;
            ckuVar.j(id2, 6, 0, 6, i6);
            ckuVar.b(linearLayout.getId()).d.K = z ? getResources().getDimensionPixelSize(R.dimen.options_menu_label_margin_top) : getResources().getDimensionPixelSize(R.dimen.options_menu_label_margin_top_legacy);
            ckuVar.j(linearLayout.getId(), 3, textView.getId(), 4, z ? 0 : getResources().getDimensionPixelSize(R.dimen.options_menu_label_margin_bottom));
            addView(linearLayout);
        }
        int dimensionPixelSize2 = z2 ? 0 : z ? getResources().getDimensionPixelSize(R.dimen.options_menu_button_margin_top) : getResources().getDimensionPixelSize(R.dimen.options_menu_button_margin_top_legacy);
        int dimensionPixelSize3 = z2 ? 0 : z ? getResources().getDimensionPixelSize(i2) : getResources().getDimensionPixelSize(R.dimen.options_menu_button_margin_right);
        if (sbpVar.size() < 5) {
            int size3 = sbpVar.size() - 1;
            while (size3 >= 0) {
                ArrayList arrayList2 = this.q;
                FrameLayout frameLayout2 = (FrameLayout) arrayList2.get(size3);
                ImageButton imageButton2 = (ImageButton) frameLayout2.getChildAt(i4);
                krr krrVar2 = (krr) sbpVar.get(size3);
                Map map = this.j;
                ksa ksaVar = krrVar2.a;
                map.put(ksaVar, imageButton2);
                this.r.put(imageButton2, krrVar2);
                imageButton2.setContentDescription(krrVar2.d);
                imageButton2.setOnClickListener(new ktm(this, krrVar2, 2));
                ckuVar.k(frameLayout2.getId(), getResources().getDimensionPixelSize(R.dimen.options_menu_button_size));
                ckuVar.l(frameLayout2.getId(), getResources().getDimensionPixelSize(R.dimen.options_menu_button_size));
                imageButton2.setImageDrawable(krrVar2.b);
                boolean zEquals = ksaVar.equals(this.p);
                imageButton2.getDrawable().setAutoMirrored(false);
                n(imageButton2, zEquals);
                imageButton2.setBackgroundTintList(colorStateList);
                imageButton2.setImageTintList(colorStateList2);
                imageButton2.setSelected(zEquals);
                if (size3 == sbpVar.size() - 1) {
                    ckuVar.j(frameLayout2.getId(), 7, 0, 7, dimensionPixelSize3);
                }
                int i7 = dimensionPixelSize3;
                int i8 = size3 + 1;
                if (i8 < sbpVar.size()) {
                    ckuVar.j(frameLayout2.getId(), 7, ((FrameLayout) arrayList2.get(i8)).getId(), 6, 0);
                }
                int i9 = dimensionPixelSize2;
                ckuVar.j(frameLayout2.getId(), 4, 0, 4, i9);
                ckuVar.j(frameLayout2.getId(), 3, 0, 3, i9);
                addView(frameLayout2);
                size3--;
                dimensionPixelSize3 = i7;
                i4 = 0;
            }
        } else {
            int i10 = dimensionPixelSize3;
            a.I(sbpVar.size() <= 6);
            for (int size4 = sbpVar.size() - 1; size4 >= 0; size4--) {
                ArrayList arrayList3 = this.q;
                FrameLayout frameLayout3 = (FrameLayout) arrayList3.get(size4);
                ImageButton imageButton3 = (ImageButton) frameLayout3.getChildAt(0);
                krr krrVar3 = (krr) sbpVar.get(size4);
                Map map2 = this.j;
                ksa ksaVar2 = krrVar3.a;
                map2.put(ksaVar2, imageButton3);
                this.r.put(imageButton3, krrVar3);
                imageButton3.setContentDescription(krrVar3.d);
                imageButton3.setOnClickListener(new ipd(this, krrVar3, 9, null));
                ckuVar.k(frameLayout3.getId(), getResources().getDimensionPixelSize(R.dimen.options_menu_button_size));
                ckuVar.l(frameLayout3.getId(), getResources().getDimensionPixelSize(R.dimen.options_menu_button_size));
                boolean zEquals2 = ksaVar2.equals(this.p);
                imageButton3.setImageDrawable(krrVar3.b);
                imageButton3.getDrawable().setAutoMirrored(false);
                n(imageButton3, zEquals2);
                imageButton3.setBackgroundTintList(colorStateList);
                imageButton3.setImageTintList(colorStateList2);
                imageButton3.setSelected(zEquals2);
                if (size4 == sbpVar.size() - 1 || size4 == sbpVar.size() - 4) {
                    ckuVar.j(frameLayout3.getId(), 7, 0, 7, i10);
                } else {
                    int i11 = size4 + 1;
                    if (i11 < sbpVar.size()) {
                        ckuVar.j(frameLayout3.getId(), 7, ((FrameLayout) arrayList3.get(i11)).getId(), 6, 0);
                    }
                }
                if (size4 >= sbpVar.size() - 3) {
                    ckuVar.j(frameLayout3.getId(), 3, 0, 3, dimensionPixelSize2);
                } else {
                    ckuVar.j(frameLayout3.getId(), 4, 0, 4, dimensionPixelSize2);
                    ckuVar.j(frameLayout3.getId(), 3, ((FrameLayout) arrayList3.get(size4 + 3)).getId(), 4, 0);
                }
                addView(frameLayout3);
            }
        }
        ckuVar.c(this);
    }

    public final void l(ksa ksaVar) {
        this.p = ksaVar;
        if (isEnabled()) {
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ImageButton imageButton = (ImageButton) ((FrameLayout) arrayList.get(i3)).getChildAt(0);
                boolean z = this.j.get(ksaVar) == imageButton;
                imageButton.setSelected(z);
                n(imageButton, z);
            }
            sbp sbpVar = this.k.d;
            int size2 = sbpVar.size();
            while (i2 < size2) {
                krr krrVar = (krr) sbpVar.get(i2);
                i2++;
                if (krrVar.a == ksaVar) {
                    String str = krrVar.c;
                    String str2 = krrVar.d;
                    m(str, str2);
                    mwq mwqVar = this.B;
                    if (mwqVar != null) {
                        mwqVar.h(str2);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
