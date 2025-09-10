package defpackage;

import android.text.TextUtils;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obj {
    public final Map a;
    public final long b;
    public final long c;
    public final int d;
    public final boolean e;

    public obj(oan oanVar, Map map, long j, boolean z, long j2, int i) {
        String strA;
        String strA2;
        ojl.ay(map);
        this.c = j;
        this.e = z;
        this.b = j2;
        this.d = i;
        List list = Collections.EMPTY_LIST;
        TextUtils.isEmpty(null);
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (c(entry.getKey()) && (strA2 = a(oanVar, entry.getKey())) != null) {
                map2.put(strA2, b(oanVar, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!c(entry2.getKey()) && (strA = a(oanVar, entry2.getKey())) != null) {
                map2.put(strA, b(oanVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.a = DesugarCollections.unmodifiableMap(map2);
    }

    private static String a(oan oanVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String string = obj.toString();
        if (string.startsWith(SHXc.gfuHTSmbAPVcLYh)) {
            string = string.substring(1);
        }
        int length = string.length();
        if (length > 256) {
            string = string.substring(0, 256);
            oanVar.v("Hit param name is too long and will be trimmed", Integer.valueOf(length), string);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    private static String b(oan oanVar, Object obj) {
        String string = obj == null ? "" : obj.toString();
        int length = string.length();
        if (length <= 8192) {
            return string;
        }
        String strSubstring = string.substring(0, 8192);
        oanVar.v("Hit param value is too long and will be trimmed", Integer.valueOf(length), strSubstring);
        return strSubstring;
    }

    private static boolean c(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ht=");
        sb.append(this.c);
        long j = this.b;
        if (j != 0) {
            sb.append(", dbId=");
            sb.append(j);
        }
        int i = this.d;
        if (i != 0) {
            sb.append(", appUID=");
            sb.append(i);
        }
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) arrayList.get(i2);
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append((String) map.get(str));
        }
        return sb.toString();
    }
}
