package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avb extends ViewGroup {
    public final int a;
    public final List b;
    public final List c;
    public int d;
    public final ebn e;

    public avb(Context context) {
        super(context);
        this.a = 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.e = new ebn((byte[]) null, (byte[]) null);
        setClipChildren(false);
        avc avcVar = new avc(context);
        addView(avcVar);
        arrayList.add(avcVar);
        arrayList2.add(avcVar);
        this.d = 1;
        setTag(R.id.hide_in_inspector_tag, true);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
