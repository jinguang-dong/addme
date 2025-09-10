package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agl {
    public final uif a;
    public final umk b;

    public agl(uif uifVar, umk umkVar) {
        this.a = uifVar;
        this.b = umkVar;
    }

    public final String toString() {
        String str;
        umk umkVar = this.b;
        unc uncVar = (unc) ((uml) umkVar).b.get(unc.b);
        String str2 = uncVar != null ? uncVar.a : null;
        StringBuilder sb = new StringBuilder("Request@");
        String string = Integer.toString(hashCode(), 16);
        string.getClass();
        sb.append(string);
        if (str2 != null) {
            str = pAAtrB.isUPklDWgjGTDM + str2 + "](";
        } else {
            str = "(";
        }
        sb.append(str);
        sb.append("currentBounds()=");
        sb.append(this.a.a());
        sb.append(", continuation=");
        sb.append(umkVar);
        sb.append(')');
        return sb.toString();
    }
}
