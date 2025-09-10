package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sdr extends sgb {
    public sdr(Iterator it) {
        super(it);
    }

    @Override // defpackage.sgb
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }
}
