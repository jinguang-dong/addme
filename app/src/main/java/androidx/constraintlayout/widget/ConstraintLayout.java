package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.cij;
import defpackage.cjn;
import defpackage.cjo;
import defpackage.cjq;
import defpackage.ckj;
import defpackage.ckl;
import defpackage.ckm;
import defpackage.cku;
import defpackage.cky;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    public final ArrayList b;
    protected final cjo c;
    public int d;
    protected boolean e;
    public int f;
    public cku g;
    final ckm h;
    private int i;
    private int j;
    private int k;
    private int l;
    private HashMap m;
    private final SparseArray n;

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException, NumberFormatException {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new cjo();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new ckm(this, this);
        g(null, 0, 0);
    }

    private final void g(AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        cjo cjoVar = this.c;
        cjoVar.ag = this;
        ckm ckmVar = this.h;
        cjoVar.aG = ckmVar;
        cjoVar.a.g = ckmVar;
        this.a.put(getId(), this);
        this.g = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cky.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.i);
                } else if (index == 17) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.d);
                } else if (index == 14) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.j);
                } else if (index == 15) {
                    this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 113) {
                    this.f = typedArrayObtainStyledAttributes.getInt(ScriptIntrinsicBLAS.CONJ_TRANSPOSE, this.f);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            cij.e(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    try {
                        cku ckuVar = new cku();
                        this.g = ckuVar;
                        ckuVar.m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.g = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.U(this.f);
    }

    private final void h() {
        this.e = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:258:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x049d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.i():void");
    }

    private final void j(cjn cjnVar, ckl cklVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        cjn cjnVar2 = (cjn) sparseArray.get(i);
        if (cjnVar2 == null || view == null || !(view.getLayoutParams() instanceof ckl)) {
            return;
        }
        cklVar.ag = true;
        if (i2 == 6) {
            ckl cklVar2 = (ckl) view.getLayoutParams();
            cklVar2.ag = true;
            cklVar2.av.F = true;
        }
        cjnVar.K(6).j(cjnVar2.K(i2), cklVar.D, cklVar.C);
        cjnVar.F = true;
        cjnVar.K(3).d();
        cjnVar.K(5).d();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ckl;
    }

    public final cjn dP(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof ckl) {
            return ((ckl) view.getLayoutParams()).av;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof ckl) {
            return ((ckl) view.getLayoutParams()).av;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: dQ, reason: merged with bridge method [inline-methods] */
    public ckl generateDefaultLayoutParams() {
        return new ckl(-2, -2);
    }

    protected final boolean dR() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    public final View dS(int i) {
        return (View) this.a.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i6 = (int) ((i4 / 1920.0f) * height);
                        int i7 = (int) ((i3 / 1080.0f) * width);
                        float f = ((int) ((i5 / 1080.0f) * width)) + i7;
                        float f2 = i7;
                        float f3 = i6;
                        canvas.drawLine(f2, f3, f, f3, paint);
                        float f4 = i6 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f, f3, f, f4, paint);
                        canvas.drawLine(f, f4, f2, f4, paint);
                        canvas.drawLine(f2, f4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f, f4, paint);
                        canvas.drawLine(f2, f4, f, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: eX, reason: merged with bridge method [inline-methods] */
    public ckl generateLayoutParams(AttributeSet attributeSet) {
        return new ckl(getContext(), attributeSet);
    }

    public final Object eY(Object obj) {
        HashMap map;
        if ((obj instanceof String) && (map = this.m) != null && map.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.View
    public final void forceLayout() {
        h();
        super.forceLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            int r5 = r4.getChildCount()
            boolean r6 = r4.isInEditMode()
            r7 = 0
            r8 = r7
        La:
            if (r8 >= r5) goto L4f
            android.view.View r9 = r4.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            ckl r0 = (defpackage.ckl) r0
            cjn r1 = r0.av
            int r2 = r9.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2d
            boolean r2 = r0.ah
            if (r2 != 0) goto L2d
            boolean r2 = r0.ai
            if (r2 != 0) goto L2d
            boolean r2 = r0.ak
            if (r6 != 0) goto L2d
            goto L48
        L2d:
            boolean r0 = r0.aj
            int r0 = r1.k()
            int r2 = r1.l()
            int r3 = r1.j()
            int r3 = r3 + r0
            int r1 = r1.h()
            int r1 = r1 + r2
            r9.layout(r0, r2, r3, r1)
            boolean r0 = r9 instanceof defpackage.ckw
            if (r0 != 0) goto L4b
        L48:
            int r8 = r8 + 1
            goto La
        L4b:
            ckw r9 = (defpackage.ckw) r9
            r4 = 0
            throw r4
        L4f:
            java.util.ArrayList r4 = r4.b
            int r5 = r4.size()
            if (r5 <= 0) goto L62
        L57:
            if (r7 >= r5) goto L62
            java.lang.Object r6 = r4.get(r7)
            ckj r6 = (defpackage.ckj) r6
            int r7 = r7 + 1
            goto L57
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0220 A[PHI: r2 r6 r11
      0x0220: PHI (r2v5 int[]) = (r2v4 int[]), (r2v74 int[]) binds: [B:73:0x01c3, B:400:0x0220] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r6v6 boolean) = (r6v5 boolean), (r6v71 boolean) binds: [B:73:0x01c3, B:400:0x0220] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r11v4 int) = (r11v3 int), (r11v80 int) binds: [B:73:0x01c3, B:400:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0235 A[PHI: r7
      0x0235: PHI (r7v1 int) = (r7v0 int), (r7v15 int) binds: [B:102:0x0228, B:104:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        cjn cjnVarDP = dP(view);
        if (z && !(cjnVarDP instanceof cjq)) {
            ckl cklVar = (ckl) view.getLayoutParams();
            cklVar.av = new cjq();
            cklVar.ah = true;
            ((cjq) cklVar.av).c(cklVar.Z);
        }
        if (view instanceof ckj) {
            ckj ckjVar = (ckj) view;
            ckjVar.h();
            ((ckl) view.getLayoutParams()).ai = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(ckjVar)) {
                arrayList.add(ckjVar);
            }
        }
        this.a.put(view.getId(), view);
        this.e = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.Y(dP(view));
        this.b.remove(view);
        this.e = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        h();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ckl(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new cjo();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new ckm(this, this);
        g(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new cjo();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new ckm(this, this);
        g(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new cjo();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new ckm(this, this);
        g(attributeSet, i, i2);
    }
}
