package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ohc implements oqa {
    protected final DataHolder a;
    protected int b;
    public int c;

    public ohc(DataHolder dataHolder, int i) {
        ojl.ay(dataHolder);
        this.a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.h) {
            z = true;
        }
        ojl.au(z);
        this.b = i;
        this.c = dataHolder.a(i);
    }

    protected final String a(String str) {
        return this.a.b(str, this.b, this.c);
    }

    protected final int b() {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.c("event_type", i);
        return dataHolder.d[i2].getInt(i, dataHolder.c.getInt("event_type"));
    }

    @Override // defpackage.oqa
    public final String c() {
        return a("asset_key");
    }

    @Override // defpackage.oqa
    public final String d() {
        return a("asset_id");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ohc) {
            ohc ohcVar = (ohc) obj;
            if (a.K(Integer.valueOf(ohcVar.b), Integer.valueOf(this.b)) && a.K(Integer.valueOf(ohcVar.c), Integer.valueOf(this.c)) && ohcVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
