package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class is {
    public int a = 0;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public int[] e = new int[0];
    public boolean f = false;
    public final TextView g;
    public final Context h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public is(TextView textView) {
        this.g = textView;
        this.h = textView.getContext();
    }

    public static final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0) {
                    Integer numValueOf = Integer.valueOf(i);
                    if (Collections.binarySearch(arrayList, numValueOf) < 0) {
                        arrayList.add(numValueOf);
                    }
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean a() {
        return !(this.g instanceof hs);
    }
}
