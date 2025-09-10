package defpackage;

import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hde {
    public static final sgv a = sgv.g("hde");
    public static final hdc b = new hdc() { // from class: hcz
        @Override // defpackage.hdc
        public final boolean a(List list, int i, mer merVar) {
            return hde.c(list, i);
        }
    };
    public final UriMatcher c = new UriMatcher(-1);
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    private final String f;

    public hde(String str) {
        this.f = str;
    }

    static /* synthetic */ boolean c(List list, int i) {
        return list.size() + (-1) == i;
    }

    private final void d(String str, String str2, rww rwwVar) {
        Map map = this.d;
        int size = map.size() + 1;
        this.c.addURI(str, str2, size);
        map.put(Integer.valueOf(size), rwwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final Cursor a(hdd hddVar, boolean z, hdc hdcVar) {
        ?? Fr = hddVar.fr();
        MatrixCursor matrixCursor = new MatrixCursor(z ? new String[]{"_id", "run", "name", "time_ns"} : new String[]{"run", "time_ns"});
        if (!Fr.isEmpty()) {
            for (int i = 0; i < Fr.size(); i++) {
                mex mexVar = (mex) Fr.get(i);
                Enum[] enumArr = mexVar.o;
                int length = enumArr.length;
                ArrayList<mer> arrayList = new ArrayList(length + 1);
                arrayList.add(new mer("TIMING_CREATION", -1, mexVar.m));
                int i2 = 0;
                while (i2 < length) {
                    Enum r12 = enumArr[i2];
                    arrayList.add(new mer(r12.name(), r12.ordinal(), mexVar.i(r12)));
                    i2++;
                    length = length;
                    enumArr = enumArr;
                }
                for (mer merVar : arrayList) {
                    if (hdcVar.a(Fr, i, merVar)) {
                        int i3 = merVar.b;
                        String str = merVar.a;
                        long j = merVar.c;
                        if (z) {
                            matrixCursor.newRow().add("_id", Integer.valueOf(i3)).add("run", Integer.valueOf(i)).add("name", str).add("time_ns", Long.valueOf(j));
                        } else {
                            matrixCursor.newRow().add("run", Integer.valueOf(i)).add("time_ns", Long.valueOf(j));
                        }
                    }
                }
            }
        }
        return matrixCursor;
    }

    public final void b(String str, Class cls, final hdd hddVar) {
        pxk pxkVar = new pxk(this, hddVar, 1);
        String str2 = this.f;
        d(str2, str, pxkVar);
        mew mewVar = mex.j;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        rnt.x(enumArr);
        ArrayList<String> arrayList = new ArrayList(enumArr.length + 1);
        arrayList.add("TIMING_CREATION");
        for (Enum r0 : enumArr) {
            arrayList.add(r0.name());
        }
        for (final String str3 : arrayList) {
            d(str2, str + "/" + str3, new rww() { // from class: hdb
                @Override // defpackage.rww
                public final Object fr() {
                    final String str4 = str3;
                    return this.a.a(hddVar, false, new hdc() { // from class: hda
                        @Override // defpackage.hdc
                        public final boolean a(List list, int i, mer merVar) {
                            if (hde.c(list, i)) {
                                return merVar.a.equals(str4);
                            }
                            return false;
                        }
                    });
                }
            });
        }
        this.e.put(str, hddVar);
    }
}
