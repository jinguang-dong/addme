package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocm extends oix {
    public static final Parcelable.Creator CREATOR = new hbs(4);
    private static final String[] m = new String[0];
    public final odh a;
    public final byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final onb[] g;
    public final boolean h;
    public odg i;
    public final int j;
    public final ocy k;
    public final tze l;
    private final String[] n;

    public ocm(odh odhVar, tze tzeVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, onb[] onbVarArr, String[] strArr2, int i) {
        this.a = odhVar;
        this.l = tzeVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = null;
        this.g = onbVarArr;
        this.h = true;
        this.n = strArr2;
        this.j = i;
        this.k = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ocm) {
            ocm ocmVar = (ocm) obj;
            if (a.K(this.a, ocmVar.a) && Arrays.equals(this.b, ocmVar.b) && Arrays.equals(this.c, ocmVar.c) && Arrays.equals(this.d, ocmVar.d) && a.K(this.l, ocmVar.l) && Arrays.equals(this.e, ocmVar.e) && Arrays.deepEquals(this.f, ocmVar.f) && Arrays.equals(this.g, ocmVar.g) && Arrays.equals(this.n, ocmVar.n) && this.h == ocmVar.h && a.K(this.i, ocmVar.i) && this.j == ocmVar.j && a.K(this.k, ocmVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.l, this.e, this.f, this.g, Boolean.valueOf(this.h), this.n, this.i, Integer.valueOf(this.j), this.k});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new String(bArr, StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.l);
        sb.append(", , ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.n));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append(", LogVerifierResult: ");
        odg odgVar = this.i;
        sb.append(odgVar != null ? odgVar.toString() : null);
        sb.append("EventCode: ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iU = ojl.u(parcel);
        ojl.I(parcel, 2, this.a, i);
        ojl.D(parcel, 3, this.b);
        ojl.G(parcel, 4, this.c);
        ojl.K(parcel, 5, this.d);
        ojl.G(parcel, 6, this.e);
        ojl.E(parcel, 7, this.f);
        ojl.x(parcel, 8, this.h);
        ojl.M(parcel, 9, this.g, i);
        ojl.I(parcel, 11, this.i, i);
        String[] strArr = this.n;
        if (strArr == null) {
            strArr = m;
        }
        ojl.K(parcel, 12, strArr);
        ojl.A(parcel, 13, this.j);
        ojl.I(parcel, 14, this.k, i);
        ojl.w(parcel, iU);
    }

    public ocm(odh odhVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, onb[] onbVarArr, odg odgVar, String[] strArr2, int i, ocy ocyVar) {
        this.a = odhVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr2;
        this.h = z;
        this.g = onbVarArr;
        this.i = odgVar;
        this.n = strArr2;
        this.j = i;
        this.l = null;
        this.k = ocyVar;
    }
}
