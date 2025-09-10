package defpackage;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nrr extends ujn implements uiq {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrr(Object obj, int i, byte[] bArr) {
        super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        this.a = i;
    }

    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ((uoo) this.e).a((Throwable) obj);
                return ufg.a;
            }
            WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
            windowLayoutInfo.getClass();
            ((MulticastConsumer) this.e).accept(windowLayoutInfo);
            return ufg.a;
        }
        nsk nskVar = (nsk) obj;
        nskVar.getClass();
        nrs nrsVar = (nrs) this.e;
        int iOrdinal = nskVar.ordinal();
        if (iOrdinal == 1) {
            nrv nrvVar = new nrv();
            nrvVar.C("key_setting_mode");
            nrsVar.C(nrvVar, "key_setting_mode");
        } else if (iOrdinal == 2) {
            nrv nrvVar2 = new nrv();
            nrvVar2.C("key_setting_facing");
            nrsVar.C(nrvVar2, "key_setting_facing");
        } else if (iOrdinal != 3) {
            ((sgt) nrs.ag.c().M(5505)).v("Current setting menu type is %s", nskVar.name());
        } else {
            nrv nrvVar3 = new nrv();
            nrvVar3.C("key_setting_timer");
            nrsVar.C(nrvVar3, "key_setting_timer");
        }
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrr(Object obj, int i) {
        super(1, obj, nrs.class, "onMenuItemClick", "onMenuItemClick(Lcom/google/android/apps/camera/wear/wearappv2/ui/settings/SettingsMenuType;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrr(Object obj, int i, char[] cArr) {
        super(1, obj, uoo.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        this.a = i;
    }
}
