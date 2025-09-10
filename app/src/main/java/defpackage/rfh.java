package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfh implements rev {
    private static final SparseArray a = qpt.V();

    @Override // defpackage.rev
    public final void a(rfo rfoVar, View view) {
        if (view.getSystemUiVisibility() != 0) {
            int systemUiVisibility = view.getSystemUiVisibility();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                SparseArray sparseArray = a;
                if (i >= sparseArray.size()) {
                    break;
                }
                int iKeyAt = sparseArray.keyAt(i);
                if ((systemUiVisibility & iKeyAt) == iKeyAt) {
                    arrayList.add((String) sparseArray.valueAt(i));
                }
                i++;
            }
            rfoVar.b("systemUiVisibility", TextUtils.join(" | ", arrayList));
        }
        int[] iArr = con.a;
        rfoVar.b("isLaidOut", String.valueOf(view.isLaidOut()));
        rfoVar.b("isLayoutRequested", String.valueOf(view.isLayoutRequested()));
        if (view.getParent() instanceof CoordinatorLayout) {
            rfoVar.b("coordinatorLayout_behavior", String.valueOf(((clf) view.getLayoutParams()).a));
        }
        if (view.getBackground() instanceof ColorDrawable) {
            rfoVar.b("backgroundColor", String.format("#%08X", Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
        } else if (view.getBackground() != null) {
            rfoVar.b("background", view.getBackground().toString());
        }
        rfoVar.b("layerType", String.valueOf(view.getLayerType()));
    }
}
