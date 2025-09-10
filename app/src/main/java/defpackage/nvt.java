package defpackage;

import android.util.IntProperty;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearSnapshot;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nvt extends IntProperty {
    public nvt() {
        super("alpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Integer get(Object obj) {
        return Integer.valueOf(((WearSnapshot) obj).getAlpha());
    }

    @Override // android.util.IntProperty
    public final /* synthetic */ void setValue(Object obj, int i) {
        ((WearSnapshot) obj).setAlpha(i);
    }
}
