package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ets implements etn {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config[] b;
    public static final Bitmap.Config[] c;
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public final etr f = new etr();
    public final eth g = new eth();
    private final Map h = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        a = configArr;
        b = configArr;
        c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        d = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        e = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    static String a(int i, Bitmap.Config config) {
        return "[" + i + "](" + String.valueOf(config) + ")";
    }

    public final NavigableMap b(Bitmap.Config config) {
        Map map = this.h;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.g);
        sb.append(", sortedSizes=(");
        Map map = this.h;
        for (Map.Entry entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!map.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    public final void c(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapB = b(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapB.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapB.remove(num);
                return;
            } else {
                navigableMapB.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException(uCzt.ejrmhX + num + ", removed: " + a(fax.a(bitmap), bitmap.getConfig()) + ", this: " + toString());
    }
}
