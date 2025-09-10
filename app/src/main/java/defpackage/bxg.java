package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bxg extends ViewGroup {
    private WeakReference a;
    private IBinder b;
    private ayj c;
    private boolean d;
    private boolean e;

    public bxg(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void e() {
        if (this.d) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void f(ayk aykVar) {
        if (true != g(aykVar)) {
            aykVar = null;
        }
        if (aykVar != null) {
            this.a = new WeakReference(aykVar);
        }
    }

    private static final boolean g(ayk aykVar) {
        return !(aykVar instanceof bao) || ((bak) ((bao) aykVar).l.c()).compareTo(bak.b) > 0;
    }

    public abstract void a(ayc aycVar, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        e();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        e();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        ayj ayjVar = this.c;
        if (ayjVar != null) {
            ayjVar.d();
        }
        this.c = null;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043 A[Catch: all -> 0x0217, TryCatch #1 {all -> 0x0217, blocks: (B:5:0x0006, B:7:0x000e, B:9:0x0014, B:11:0x0018, B:14:0x0026, B:18:0x002e, B:20:0x0032, B:22:0x003a, B:26:0x0043, B:28:0x0049, B:29:0x0054, B:30:0x0059, B:32:0x005d, B:35:0x0069, B:36:0x0071, B:38:0x0077, B:42:0x00b2, B:39:0x00ac, B:41:0x00b0, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:47:0x00d9, B:48:0x00f9, B:50:0x0102, B:51:0x0103, B:53:0x0108, B:54:0x0109, B:55:0x010a, B:57:0x0110, B:59:0x0118, B:63:0x0121, B:64:0x0133, B:66:0x013e, B:69:0x0144, B:70:0x0158, B:72:0x0167, B:74:0x0177, B:75:0x017d, B:77:0x0185, B:78:0x018a, B:80:0x019b, B:82:0x01a6, B:84:0x01aa, B:88:0x01ba, B:92:0x01c3, B:94:0x01c7, B:96:0x01cd, B:115:0x0206, B:97:0x01d3, B:99:0x01d8, B:101:0x01dc, B:103:0x01e4, B:105:0x01e9, B:109:0x01f1, B:111:0x01fa, B:112:0x01fd, B:113:0x0201, B:116:0x020b, B:117:0x020e, B:81:0x01a3, B:118:0x0212, B:60:0x011b, B:49:0x00fa), top: B:127:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121 A[Catch: all -> 0x0217, TryCatch #1 {all -> 0x0217, blocks: (B:5:0x0006, B:7:0x000e, B:9:0x0014, B:11:0x0018, B:14:0x0026, B:18:0x002e, B:20:0x0032, B:22:0x003a, B:26:0x0043, B:28:0x0049, B:29:0x0054, B:30:0x0059, B:32:0x005d, B:35:0x0069, B:36:0x0071, B:38:0x0077, B:42:0x00b2, B:39:0x00ac, B:41:0x00b0, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:47:0x00d9, B:48:0x00f9, B:50:0x0102, B:51:0x0103, B:53:0x0108, B:54:0x0109, B:55:0x010a, B:57:0x0110, B:59:0x0118, B:63:0x0121, B:64:0x0133, B:66:0x013e, B:69:0x0144, B:70:0x0158, B:72:0x0167, B:74:0x0177, B:75:0x017d, B:77:0x0185, B:78:0x018a, B:80:0x019b, B:82:0x01a6, B:84:0x01aa, B:88:0x01ba, B:92:0x01c3, B:94:0x01c7, B:96:0x01cd, B:115:0x0206, B:97:0x01d3, B:99:0x01d8, B:101:0x01dc, B:103:0x01e4, B:105:0x01e9, B:109:0x01f1, B:111:0x01fa, B:112:0x01fd, B:113:0x0201, B:116:0x020b, B:117:0x020e, B:81:0x01a3, B:118:0x0212, B:60:0x011b, B:49:0x00fa), top: B:127:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013e A[Catch: all -> 0x0217, TryCatch #1 {all -> 0x0217, blocks: (B:5:0x0006, B:7:0x000e, B:9:0x0014, B:11:0x0018, B:14:0x0026, B:18:0x002e, B:20:0x0032, B:22:0x003a, B:26:0x0043, B:28:0x0049, B:29:0x0054, B:30:0x0059, B:32:0x005d, B:35:0x0069, B:36:0x0071, B:38:0x0077, B:42:0x00b2, B:39:0x00ac, B:41:0x00b0, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:47:0x00d9, B:48:0x00f9, B:50:0x0102, B:51:0x0103, B:53:0x0108, B:54:0x0109, B:55:0x010a, B:57:0x0110, B:59:0x0118, B:63:0x0121, B:64:0x0133, B:66:0x013e, B:69:0x0144, B:70:0x0158, B:72:0x0167, B:74:0x0177, B:75:0x017d, B:77:0x0185, B:78:0x018a, B:80:0x019b, B:82:0x01a6, B:84:0x01aa, B:88:0x01ba, B:92:0x01c3, B:94:0x01c7, B:96:0x01cd, B:115:0x0206, B:97:0x01d3, B:99:0x01d8, B:101:0x01dc, B:103:0x01e4, B:105:0x01e9, B:109:0x01f1, B:111:0x01fa, B:112:0x01fd, B:113:0x0201, B:116:0x020b, B:117:0x020e, B:81:0x01a3, B:118:0x0212, B:60:0x011b, B:49:0x00fa), top: B:127:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144 A[Catch: all -> 0x0217, TryCatch #1 {all -> 0x0217, blocks: (B:5:0x0006, B:7:0x000e, B:9:0x0014, B:11:0x0018, B:14:0x0026, B:18:0x002e, B:20:0x0032, B:22:0x003a, B:26:0x0043, B:28:0x0049, B:29:0x0054, B:30:0x0059, B:32:0x005d, B:35:0x0069, B:36:0x0071, B:38:0x0077, B:42:0x00b2, B:39:0x00ac, B:41:0x00b0, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:47:0x00d9, B:48:0x00f9, B:50:0x0102, B:51:0x0103, B:53:0x0108, B:54:0x0109, B:55:0x010a, B:57:0x0110, B:59:0x0118, B:63:0x0121, B:64:0x0133, B:66:0x013e, B:69:0x0144, B:70:0x0158, B:72:0x0167, B:74:0x0177, B:75:0x017d, B:77:0x0185, B:78:0x018a, B:80:0x019b, B:82:0x01a6, B:84:0x01aa, B:88:0x01ba, B:92:0x01c3, B:94:0x01c7, B:96:0x01cd, B:115:0x0206, B:97:0x01d3, B:99:0x01d8, B:101:0x01dc, B:103:0x01e4, B:105:0x01e9, B:109:0x01f1, B:111:0x01fa, B:112:0x01fd, B:113:0x0201, B:116:0x020b, B:117:0x020e, B:81:0x01a3, B:118:0x0212, B:60:0x011b, B:49:0x00fa), top: B:127:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167 A[Catch: all -> 0x0217, TryCatch #1 {all -> 0x0217, blocks: (B:5:0x0006, B:7:0x000e, B:9:0x0014, B:11:0x0018, B:14:0x0026, B:18:0x002e, B:20:0x0032, B:22:0x003a, B:26:0x0043, B:28:0x0049, B:29:0x0054, B:30:0x0059, B:32:0x005d, B:35:0x0069, B:36:0x0071, B:38:0x0077, B:42:0x00b2, B:39:0x00ac, B:41:0x00b0, B:43:0x00b6, B:44:0x00bd, B:45:0x00be, B:47:0x00d9, B:48:0x00f9, B:50:0x0102, B:51:0x0103, B:53:0x0108, B:54:0x0109, B:55:0x010a, B:57:0x0110, B:59:0x0118, B:63:0x0121, B:64:0x0133, B:66:0x013e, B:69:0x0144, B:70:0x0158, B:72:0x0167, B:74:0x0177, B:75:0x017d, B:77:0x0185, B:78:0x018a, B:80:0x019b, B:82:0x01a6, B:84:0x01aa, B:88:0x01ba, B:92:0x01c3, B:94:0x01c7, B:96:0x01cd, B:115:0x0206, B:97:0x01d3, B:99:0x01d8, B:101:0x01dc, B:103:0x01e4, B:105:0x01e9, B:109:0x01f1, B:111:0x01fa, B:112:0x01fd, B:113:0x0201, B:116:0x020b, B:117:0x020e, B:81:0x01a3, B:118:0x0212, B:60:0x011b, B:49:0x00fa), top: B:127:0x0006 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View, bxg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [bij] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [bij] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [bdp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxg.c():void");
    }

    protected boolean d() {
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.e || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IBinder windowToken = getWindowToken();
        if (this.b != windowToken) {
            this.b = windowToken;
            this.a = null;
        }
        if (d()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        c();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    @Override // android.view.ViewGroup
    public final void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.e = true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public bxg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public bxg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        addOnAttachStateChangeListener(new bzz(this, 0));
        ((ArrayList) col.g(this).a).add(new rnu(this, null));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        e();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        e();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        e();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        e();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        super.addView(view, layoutParams);
    }

    public /* synthetic */ bxg(Context context, AttributeSet attributeSet, int i, int i2, ujk ujkVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
