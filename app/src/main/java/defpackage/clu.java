package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Process;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clu {
    public static int a(Context context, String str) {
        coe.f(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static ColorStateList b(Context context, int i) throws Resources.NotFoundException {
        ColorStateList colorStateListA;
        Object colorStateList;
        qzx qzxVar;
        Resources.Theme theme;
        Resources resources = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        ThreadLocal threadLocal = cme.a;
        cmb cmbVar = new cmb(resources, theme2);
        synchronized (cme.c) {
            SparseArray sparseArray = (SparseArray) cme.b.get(cmbVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (qzxVar = (qzx) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!((Configuration) qzxVar.c).equals(cmbVar.a.getConfiguration()) || (!((theme = cmbVar.b) == null && qzxVar.a == 0) && (theme == null || qzxVar.a != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = qzxVar.b;
            }
        }
        if (colorStateList == null) {
            ThreadLocal threadLocal2 = cme.a;
            TypedValue typedValue = (TypedValue) threadLocal2.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal2.set(typedValue);
            }
            resources.getValue(i, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                try {
                    colorStateListA = clz.a(resources, resources.getXml(i), theme2);
                } catch (Exception e) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateListA != null) {
                synchronized (cme.c) {
                    WeakHashMap weakHashMap = cme.b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(cmbVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(cmbVar, sparseArray2);
                    }
                    sparseArray2.append(i, new qzx(colorStateListA, cmbVar.a.getConfiguration(), theme2));
                }
                colorStateList = colorStateListA;
            } else {
                colorStateList = resources.getColorStateList(i, theme2);
            }
        }
        return (ColorStateList) colorStateList;
    }

    @Deprecated
    public static File[] c(Context context) {
        return context.getExternalFilesDirs(null);
    }

    public static void d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        if ((i & 1) != 0) {
            if ((i & 4) != 0) {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            }
            i |= 2;
        }
        int i2 = i;
        int i3 = i2 & 4;
        if ((i2 & 2) == 0) {
            if (i3 == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            }
        } else if (i3 != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        context.registerReceiver(broadcastReceiver, intentFilter, null, null, i2);
    }
}
