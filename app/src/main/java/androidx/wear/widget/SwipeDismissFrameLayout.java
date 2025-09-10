package androidx.wear.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.dss;
import defpackage.dtc;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwipeDismissFrameLayout extends dtc {
    final ArrayList b;

    public SwipeDismissFrameLayout(Context context) {
        this(context, null, 0);
    }

    @Override // defpackage.dtc
    protected final void a() {
        dss.b(this);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    @Override // defpackage.dtc
    protected final void b() {
        dss.b(this);
        ArrayList arrayList = this.b;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        throw null;
    }

    @Override // defpackage.dtc
    protected final void c() {
        dss.b(this);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwipeDismissFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new ArrayList();
    }
}
