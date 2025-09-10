package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rpv extends ArrayAdapter {
    final /* synthetic */ rpw a;
    private final ColorStateList b;
    private final ColorStateList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpv(rpw rpwVar, Context context, int i, String[] strArr) {
        ColorStateList colorStateList;
        super(context, i, strArr);
        this.a = rpwVar;
        ColorStateList colorStateList2 = null;
        if (b()) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{rpwVar.c.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.c = colorStateList;
        if (a() && b()) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{cmg.d(rpwVar.c.getColorForState(iArr3, 0), rpwVar.b), cmg.d(rpwVar.c.getColorForState(iArr2, 0), rpwVar.b), rpwVar.b});
        }
        this.b = colorStateList2;
    }

    private final boolean a() {
        return this.a.b != 0;
    }

    private final boolean b() {
        return this.a.c != null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            rpw rpwVar = this.a;
            Drawable rippleDrawable = null;
            if (rpwVar.getText().toString().contentEquals(textView.getText()) && a()) {
                ColorDrawable colorDrawable = new ColorDrawable(rpwVar.b);
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    colorDrawable.setTintList(this.b);
                    rippleDrawable = new RippleDrawable(colorStateList, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
