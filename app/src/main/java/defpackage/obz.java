package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class obz implements ocj {
    public static volatile int a = -1;
    public static final onb[] b = new onb[0];
    public static final String[] c = new String[0];

    @Deprecated
    public static final mwq l;
    private static final ojl m;
    public final ocl d;
    public final String e;
    public final Context f;
    protected final ocd g;
    protected final String h;
    public final String i;
    public final oco j;
    public final qaq k;

    static {
        oby obyVar = new oby();
        m = obyVar;
        l = new mwq("ClearcutLogger.API", obyVar, (char[]) null);
    }

    protected obz(Context context, String str, String str2, oco ocoVar, ocd ocdVar, ocl oclVar, qaq qaqVar) {
        if (!ocoVar.a(ocp.ACCOUNT_NAME)) {
            ojl.aq(str2 == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        b(ocoVar);
        this.f = context.getApplicationContext();
        this.i = context.getPackageName();
        this.h = str;
        this.e = str2;
        this.j = ocoVar;
        this.g = ocdVar == null ? new ocw(context) : ocdVar;
        this.d = oclVar == null ? new odf(context) : oclVar;
        this.k = qaqVar;
    }

    static final String a(Iterable iterable) {
        return rnt.Z(iterable, ", ");
    }

    public static final void b(oco ocoVar) {
        if (!ocoVar.equals(oco.c) && !ocoVar.equals(oco.a) && !ocoVar.equals(oco.b)) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    public static final int[] d(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    @Override // defpackage.ocj
    public final boolean c() {
        return this.j.equals(oco.b);
    }
}
