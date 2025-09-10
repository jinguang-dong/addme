package com.google.android.apps.camera.moments.api;

import android.graphics.Rect;
import defpackage.lnl;
import defpackage.lno;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GroupPhotoUtils {
    public static int a(lnl lnlVar) {
        return b(lnlVar, Float.MAX_VALUE);
    }

    public static int b(lnl lnlVar, float f) {
        lno[] lnoVarArr = lnlVar.r;
        if (lnoVarArr != null && (lnoVarArr.length) != 0) {
            int i = lnlVar.u;
            int iHeight = (i == 90 || i == 270) ? lnlVar.v.height() : lnlVar.v.width();
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (lno lnoVar : lnoVarArr) {
                if ((((i == 90 || i == 270) ? lnoVar.a.height() : lnoVar.a.width()) * 1.7f) / iHeight > 0.05f && lnoVar.k < Math.abs(f)) {
                    Rect rect = lnoVar.a;
                    int iWidth = rect.width() * rect.height();
                    arrayList.add(Integer.valueOf(iWidth));
                    if (i2 < iWidth) {
                        i2 = iWidth;
                    }
                }
            }
            if (!arrayList.isEmpty() && i2 != 0) {
                int size = arrayList.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    if (((Integer) arrayList.get(i4)).intValue() / i2 > 0.33f) {
                        i3++;
                    }
                }
                return i3;
            }
        }
        return 0;
    }
}
