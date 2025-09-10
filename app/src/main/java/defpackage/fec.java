package defpackage;

import android.util.Pair;
import java.lang.reflect.Array;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fec {
    public static final sgv a = sgv.g("fec");

    public static String a(Object obj) {
        if (obj == null) {
            return "<null>";
        }
        if (obj.getClass().isArray()) {
            StringBuilder sb = new StringBuilder("[");
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                sb.append(a(Array.get(obj, i)));
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            sb.append(']');
            return sb.toString();
        }
        if (!(obj instanceof Pair)) {
            return obj.toString();
        }
        Pair pair = (Pair) obj;
        return "Pair: " + a(pair.first) + " / " + a(pair.second);
    }
}
