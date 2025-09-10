package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eia {
    public static final eia a = new eia("COMPOSITION");
    public eib b;
    private final List c;

    private eia(eia eiaVar) {
        this.c = new ArrayList(eiaVar.c);
        this.b = eiaVar.b;
    }

    private static final boolean h(String str) {
        return "__container".equals(str);
    }

    public final int a(String str, int i) {
        if (h(str)) {
            return 0;
        }
        List list = this.c;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() + (-1) && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final eia b(String str) {
        eia eiaVar = new eia(this);
        eiaVar.c.add(str);
        return eiaVar;
    }

    public final eia c(eib eibVar) {
        eia eiaVar = new eia(this);
        eiaVar.b = eibVar;
        return eiaVar;
    }

    public final boolean d(String str, int i) {
        List list = this.c;
        if (i >= list.size()) {
            return false;
        }
        int size = list.size() - 1;
        String str2 = (String) list.get(i);
        if (!str2.equals("**")) {
            return (i == size || (i == list.size() + (-2) && g())) && (str2.equals(str) || str2.equals("*"));
        }
        if (i == size) {
            return true;
        }
        int i2 = i + 1;
        if (((String) list.get(i2)).equals(str)) {
            if (i != list.size() - 2) {
                return i == list.size() + (-3) && g();
            }
            return true;
        }
        if (i2 < list.size() - 1) {
            return false;
        }
        return ((String) list.get(i2)).equals(str);
    }

    public final boolean e(String str, int i) {
        if (h(str)) {
            return true;
        }
        List list = this.c;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eia eiaVar = (eia) obj;
        if (!this.c.equals(eiaVar.c)) {
            return false;
        }
        eib eibVar = this.b;
        return eibVar != null ? eibVar.equals(eiaVar.b) : eiaVar.b == null;
    }

    public final boolean f(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.c;
        return i < list.size() + (-1) || ((String) list.get(i)).equals("**");
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        eib eibVar = this.b;
        return iHashCode + (eibVar != null ? eibVar.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        eib eibVar = this.b;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(strValueOf);
        sb.append(",resolved=");
        sb.append(eibVar != null);
        sb.append("}");
        return sb.toString();
    }

    public eia(String... strArr) {
        this.c = Arrays.asList(strArr);
    }

    private final boolean g() {
        return ((String) this.c.get(r1.size() - 1)).equals(CZAHo.WkNJmCMNSMdnYZ);
    }
}
