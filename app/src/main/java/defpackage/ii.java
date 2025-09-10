package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ii extends Spinner {
    private static final int[] e = {R.attr.spinnerMode};
    public final Context a;
    public ih b;
    int c;
    final Rect d;
    private final hn f;
    private jl g;
    private SpinnerAdapter h;
    private final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ii(android.content.Context r11, android.util.AttributeSet r12) throws java.lang.Throwable {
        /*
            r10 = this;
            r0 = 2130970233(0x7f040679, float:1.754917E38)
            r10.<init>(r11, r12, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.d = r1
            android.content.Context r1 = r10.getContext()
            defpackage.lw.d(r10, r1)
            int[] r1 = defpackage.fa.u
            r2 = 0
            pmg r1 = defpackage.pmg.J(r11, r12, r1, r0, r2)
            hn r3 = new hn
            r3.<init>(r10)
            r10.f = r3
            r3 = 4
            int r3 = r1.x(r3, r2)
            if (r3 == 0) goto L31
            on r4 = new on
            r4.<init>(r11, r3)
            r10.a = r4
            goto L33
        L31:
            r10.a = r11
        L33:
            r3 = 1
            r4 = 0
            int[] r5 = defpackage.ii.e     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L9c
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r0, r2)     // Catch: java.lang.Throwable -> L95 java.lang.Exception -> L9c
            boolean r6 = r5.hasValue(r2)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L9d
            if (r6 == 0) goto L46
            int r6 = r5.getInt(r2, r2)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L9d
            goto L47
        L46:
            r6 = -1
        L47:
            if (r5 == 0) goto L4c
            r5.recycle()
        L4c:
            r5 = 2
            if (r6 == 0) goto L83
            if (r6 == r3) goto L52
            goto La2
        L52:
            if r6 = new if
            android.content.Context r7 = r10.a
            r6.<init>(r10, r7, r12)
            android.content.Context r7 = r10.a
            int[] r8 = defpackage.fa.u
            pmg r7 = defpackage.pmg.J(r7, r12, r8, r0, r2)
            r8 = 3
            r9 = -2
            int r8 = r7.w(r8, r9)
            r10.c = r8
            android.graphics.drawable.Drawable r8 = r7.z(r3)
            r6.f(r8)
            java.lang.String r5 = r1.C(r5)
            r6.a = r5
            r7.D()
            r10.b = r6
            ib r5 = new ib
            r5.<init>(r10, r10, r6)
            r10.g = r5
            goto La2
        L83:
            ic r6 = new ic
            r6.<init>(r10)
            r10.b = r6
            java.lang.String r5 = r1.C(r5)
            r6.i(r5)
            goto La2
        L92:
            r10 = move-exception
            r4 = r5
            goto L96
        L95:
            r10 = move-exception
        L96:
            if (r4 == 0) goto L9b
            r4.recycle()
        L9b:
            throw r10
        L9c:
            r5 = r4
        L9d:
            if (r5 == 0) goto La2
            r5.recycle()
        La2:
            java.lang.Object r5 = r1.b
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            java.lang.CharSequence[] r2 = r5.getTextArray(r2)
            if (r2 == 0) goto Lbd
            android.widget.ArrayAdapter r5 = new android.widget.ArrayAdapter
            r6 = 17367048(0x1090008, float:2.5162948E-38)
            r5.<init>(r11, r6, r2)
            r11 = 2131624360(0x7f0e01a8, float:1.8875898E38)
            r5.setDropDownViewResource(r11)
            r10.setAdapter(r5)
        Lbd:
            r1.D()
            r10.i = r3
            android.widget.SpinnerAdapter r11 = r10.h
            if (r11 == 0) goto Lcb
            r10.setAdapter(r11)
            r10.h = r4
        Lcb:
            hn r10 = r10.f
            r10.b(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        int iMax2 = Math.max(0, iMax - (15 - (iMin - iMax)));
        View view = null;
        int iMax3 = 0;
        while (iMax2 < iMin) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax2);
            int i2 = itemViewType != i ? itemViewType : i;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(iMax2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax3 = Math.max(iMax3, view.getMeasuredWidth());
            iMax2++;
            i = i2;
        }
        if (drawable == null) {
            return iMax3;
        }
        Rect rect = this.d;
        drawable.getPadding(rect);
        return iMax3 + rect.left + rect.right;
    }

    public final void b() {
        this.b.l(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hn hnVar = this.f;
        if (hnVar != null) {
            hnVar.a();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        ih ihVar = this.b;
        return ihVar != null ? ihVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        ih ihVar = this.b;
        return ihVar != null ? ihVar.b() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.b != null ? this.c : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        ih ihVar = this.b;
        return ihVar != null ? ihVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.a;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        ih ihVar = this.b;
        return ihVar != null ? ihVar.d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ih ihVar = this.b;
        if (ihVar == null || !ihVar.u()) {
            return;
        }
        this.b.k();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        ig igVar = (ig) parcelable;
        super.onRestoreInstanceState(igVar.getSuperState());
        if (!igVar.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new gr(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        ig igVar = new ig(super.onSaveInstanceState());
        ih ihVar = this.b;
        boolean z = false;
        if (ihVar != null && ihVar.u()) {
            z = true;
        }
        igVar.a = z;
        return igVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jl jlVar = this.g;
        if (jlVar == null || !jlVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        ih ihVar = this.b;
        if (ihVar == null) {
            return super.performClick();
        }
        if (ihVar.u()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        hn hnVar = this.f;
        if (hnVar != null) {
            hnVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        hn hnVar = this.f;
        if (hnVar != null) {
            hnVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        ih ihVar = this.b;
        if (ihVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            ihVar.h(i);
            this.b.g(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        ih ihVar = this.b;
        if (ihVar != null) {
            ihVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        ih ihVar = this.b;
        if (ihVar != null) {
            ihVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(byi.bJ(this.a, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        ih ihVar = this.b;
        if (ihVar != null) {
            ihVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            Context context = this.a;
            if (context == null) {
                context = getContext();
            }
            this.b.e(new id(spinnerAdapter, context.getTheme()));
        }
    }
}
