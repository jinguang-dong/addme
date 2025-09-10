package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uow {
    public static final uwc a = new uwc("COMPLETING_ALREADY");
    public static final uwc b = new uwc("COMPLETING_WAITING_CHILDREN");
    public static final uwc c = new uwc(LmJPKwPBa.qcGNcPD);
    public static final uwc d = new uwc("TOO_LATE_TO_CANCEL");
    public static final uwc e = new uwc("SEALED");
    public static final unv f = new unv(false);
    public static final unv g = new unv(true);

    public static final Object a(Object obj) {
        return obj instanceof uoh ? new uoi((uoh) obj) : obj;
    }

    public static final Object b(Object obj) {
        uoh uohVar;
        uoi uoiVar = obj instanceof uoi ? (uoi) obj : null;
        return (uoiVar == null || (uohVar = uoiVar.a) == null) ? obj : uohVar;
    }
}
