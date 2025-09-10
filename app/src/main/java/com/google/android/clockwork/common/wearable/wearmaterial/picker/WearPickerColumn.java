package com.google.android.clockwork.common.wearable.wearmaterial.picker;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.transition.TransitionInflater;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.ipg;
import defpackage.ki;
import defpackage.kq;
import defpackage.kt;
import defpackage.nxh;
import defpackage.nxp;
import defpackage.nxu;
import defpackage.nxw;
import defpackage.nxx;
import defpackage.nxy;
import defpackage.nxz;
import defpackage.nyf;
import defpackage.qaq;
import defpackage.scf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WearPickerColumn extends FrameLayout {
    public final GestureDetector a;
    public final qaq b;
    private final nxy c;
    private final Rect d;
    private TextView e;
    private boolean f;
    private CenteredRecyclerView g;
    private final kt h;
    private final nxz i;
    private int j;

    static {
        View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public WearPickerColumn(Context context) {
        this(context, null);
    }

    private final int c() {
        int childCount = this.g.getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return this.g.getChildAt(childCount / 2).getMeasuredHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(android.graphics.Rect r6, int r7, android.view.View r8) {
        /*
            r5 = this;
            int r0 = r8.getVisibility()
            r1 = 8
            if (r0 == r1) goto L7f
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r0.gravity
            r2 = -1
            if (r1 != r2) goto L16
            r1 = 8388659(0x800033, float:1.1755015E-38)
        L16:
            int r5 = r5.getLayoutDirection()
            int r5 = android.view.Gravity.getAbsoluteGravity(r1, r5)
            int r2 = r8.getMeasuredWidth()
            r5 = r5 & 7
            r3 = 1
            if (r5 == r3) goto L36
            r3 = 5
            if (r5 == r3) goto L2f
            int r5 = r6.left
            int r3 = r0.leftMargin
            goto L49
        L2f:
            int r5 = r6.right
            int r5 = r5 - r2
            int r3 = r0.rightMargin
            int r5 = r5 - r3
            goto L4a
        L36:
            int r5 = r6.left
            int r3 = r6.right
            int r4 = r6.left
            int r3 = r3 - r4
            int r3 = r3 - r2
            int r3 = r3 / 2
            int r5 = r5 + r3
            int r3 = r0.leftMargin
            int r5 = r5 + r3
            int r3 = r0.rightMargin
            int r5 = r5 - r3
            int r3 = r2 % 2
        L49:
            int r5 = r5 + r3
        L4a:
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r3 = r8.getMeasuredHeight()
            r4 = 16
            if (r1 == r4) goto L65
            r4 = 80
            if (r1 == r4) goto L5e
            int r6 = r6.top
            int r0 = r0.topMargin
            int r6 = r6 + r0
            goto L79
        L5e:
            int r6 = r6.bottom
            int r6 = r6 - r3
            int r0 = r0.bottomMargin
            int r6 = r6 - r0
            goto L79
        L65:
            int r1 = r6.top
            int r4 = r6.bottom
            int r6 = r6.top
            int r4 = r4 - r6
            int r4 = r4 - r3
            int r4 = r4 / 2
            int r1 = r1 + r4
            int r6 = r0.topMargin
            int r1 = r1 + r6
            int r6 = r0.bottomMargin
            int r1 = r1 - r6
            int r6 = r3 % 2
            int r6 = r6 + r1
        L79:
            int r7 = r7 + r6
            int r2 = r2 + r5
            int r3 = r3 + r7
            r8.layout(r5, r7, r2, r3)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.clockwork.common.wearable.wearmaterial.picker.WearPickerColumn.d(android.graphics.Rect, int, android.view.View):void");
    }

    public final void a(nyf nyfVar) {
        if (this.f || nyfVar == null) {
            ki kiVar = this.g.l;
            if (kiVar instanceof nxp) {
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetActivated(boolean z) {
        super.dispatchSetActivated(z);
        if (z) {
            this.e.setActivated(false);
        }
        this.g.setImportantForAccessibility(true != z ? 2 : 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        kq kqVar = this.g.m;
        int i5 = i4 - i2;
        if (kqVar instanceof nxh) {
            int i6 = i5 / 2;
            nxh nxhVar = (nxh) kqVar;
            if (nxhVar.b != i6) {
                nxhVar.b = i6;
                nxhVar.aT();
            }
        }
        Rect rect = this.d;
        rect.left = getPaddingLeft();
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = i5 - getPaddingBottom();
        d(rect, 0, this.g);
        d(rect, ((getHeight() - c()) / 2) - this.e.getMeasuredHeight(), this.e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        nxy nxyVar = this.c;
        int i3 = 0;
        nxyVar.a = 0;
        nxyVar.b = 0;
        nxyVar.c = 0;
        nxyVar.d = 0;
        nxyVar.e = 0;
        int i4 = true != this.b.y() ? -2 : -1;
        CenteredRecyclerView centeredRecyclerView = this.g;
        ViewGroup.LayoutParams layoutParams = centeredRecyclerView.getLayoutParams();
        layoutParams.width = i4;
        centeredRecyclerView.setLayoutParams(layoutParams);
        nxyVar.a(this, i, i2, this.e);
        if (this.e.getVisibility() == 0) {
            int i5 = nxyVar.d;
            i3 = i5 + i5;
        }
        nxyVar.b += i3 + Math.max(nxyVar.a(this, i, i2, this.g), c());
        nxyVar.a += getPaddingLeft() + getPaddingRight();
        nxyVar.b += getPaddingTop() + getPaddingBottom();
        nxyVar.a = Math.max(nxyVar.a, getSuggestedMinimumWidth());
        nxyVar.b = Math.max(nxyVar.b, getSuggestedMinimumHeight());
        int i6 = nxyVar.e;
        setMeasuredDimension(View.resolveSizeAndState(nxyVar.a, i, i6), View.resolveSizeAndState(nxyVar.b, i2, i6 << 16));
    }

    public WearPickerColumn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearPickerColumn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.theme}, i, com.google.ar.core.R.style.WearPickerDefault);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                context.getTheme().applyStyle(resourceId, false);
            }
            typedArrayObtainStyledAttributes.recycle();
            this.c = new nxy();
            this.d = new Rect();
            this.f = true;
            this.j = 2;
            nxw nxwVar = new nxw(this);
            this.h = nxwVar;
            nxz nxzVar = new nxz(new ipg(this, 4));
            this.i = nxzVar;
            this.b = new qaq(context, (byte[]) null, (char[]) null);
            this.a = new GestureDetector(getContext(), new nxx());
            Context context2 = getContext();
            LayoutInflater.from(context2).inflate(com.google.ar.core.R.layout.wear_picker_column, (ViewGroup) this, true);
            this.e = (TextView) findViewById(com.google.ar.core.R.id.wear_picker_column_label);
            CenteredRecyclerView centeredRecyclerView = (CenteredRecyclerView) findViewById(com.google.ar.core.R.id.wear_picker_column_expanded);
            this.g = centeredRecyclerView;
            centeredRecyclerView.setOnGenericMotionListener(nxzVar);
            this.g.av();
            kq kqVar = this.g.m;
            if (kqVar instanceof nxh) {
                ((nxh) kqVar).c = new scf();
            }
            typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, nxu.c, i, 0);
            try {
                this.e.setText(typedArrayObtainStyledAttributes.getString(0));
                boolean z = typedArrayObtainStyledAttributes.getBoolean(1, this.f);
                if (z != this.f) {
                    this.f = z;
                    if (!z) {
                        a(null);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
                TransitionInflater transitionInflaterFrom = TransitionInflater.from(context2);
                transitionInflaterFrom.inflateTransition(com.google.ar.core.R.transition.wear_picker_column_collapse);
                transitionInflaterFrom.inflateTransition(com.google.ar.core.R.transition.wear_picker_column_expand);
                setWillNotDraw(true);
                this.g.s(nxwVar);
                if (this.j == 2) {
                    CenteredRecyclerView centeredRecyclerView2 = this.g;
                    PickerVignetteDrawable pickerVignetteDrawableAD = centeredRecyclerView2.aD();
                    if (pickerVignetteDrawableAD != null) {
                        Animator animator = centeredRecyclerView2.an;
                        pickerVignetteDrawableAD.setVignetteAlpha(255);
                    }
                } else {
                    CenteredRecyclerView centeredRecyclerView3 = this.g;
                    PickerVignetteDrawable pickerVignetteDrawableAD2 = centeredRecyclerView3.aD();
                    if (pickerVignetteDrawableAD2 != null) {
                        Animator animator2 = centeredRecyclerView3.an;
                        pickerVignetteDrawableAD2.setVignetteAlpha(0);
                    }
                }
                this.e.setVisibility(8);
            } finally {
            }
        } finally {
        }
    }
}
