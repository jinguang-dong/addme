package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tyq extends fbi implements IInterface {
    private final /* synthetic */ int a;
    private final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyq(ogn ognVar, int i) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
        this.a = i;
        this.b = ognVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.vr.vrcore.controller.api.ControllerServiceBridge$Callbacks, java.lang.Object] */
    @Override // defpackage.fbi
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                if (i != 2) {
                    return false;
                }
                ((ogn) this.b).b(new ops());
                return true;
            }
            if (i == 1) {
                parcel2.writeNoException();
                parcel2.writeInt(25);
                return true;
            }
            if (i != 2) {
                return false;
            }
            int i3 = parcel.readInt();
            fbj.b(parcel);
            ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge) ((WeakReference) this.b).get();
            if (controllerServiceBridge == null || i3 != 1) {
                return true;
            }
            controllerServiceBridge.b.post(new smv(controllerServiceBridge, 7));
            return true;
        }
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(25);
            return true;
        }
        if (i == 2) {
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            fbj.b(parcel);
            tym tymVar = (tym) ((WeakReference) this.b).get();
            if (tymVar == null) {
                return true;
            }
            tymVar.b.d(i4, i5);
            return true;
        }
        switch (i) {
            case 9:
                tym tymVar2 = (tym) ((WeakReference) this.b).get();
                ?? r5 = tymVar2 == null ? 0 : tymVar2.c;
                parcel2.writeNoException();
                int i6 = fbj.a;
                if (r5 == 0) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                r5.writeToParcel(parcel2, 1);
                return true;
            case 10:
                tyf tyfVar = (tyf) fbj.a(parcel, tyf.CREATOR);
                fbj.b(parcel);
                tym tymVar3 = (tym) ((WeakReference) this.b).get();
                if (tymVar3 == null) {
                    return true;
                }
                tyfVar.d(tymVar3.a);
                tymVar3.b.a(tyfVar);
                tyfVar.c();
                return true;
            case 11:
                tyi tyiVar = (tyi) fbj.a(parcel, tyi.CREATOR);
                fbj.b(parcel);
                tym tymVar4 = (tym) ((WeakReference) this.b).get();
                if (tymVar4 == null) {
                    return true;
                }
                tyiVar.e = tymVar4.a;
                tymVar4.b.c(tyiVar);
                return true;
            case 12:
                tye tyeVar = (tye) fbj.a(parcel, tye.CREATOR);
                fbj.b(parcel);
                tym tymVar5 = (tym) ((WeakReference) this.b).get();
                if (tymVar5 == null) {
                    return true;
                }
                int i7 = ControllerServiceBridge.h;
                if (tyeVar.g != 0) {
                    long jConvert = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS) - tyeVar.g;
                    if (jConvert > 300) {
                        Log.w("VrCtl.ServiceBridge", "Experiencing large controller packet delivery time between service and  client: timestamp diff in ms: " + jConvert);
                    }
                }
                tyeVar.d(tymVar5.a);
                tymVar5.b.b(tyeVar);
                tyeVar.c();
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyq(tym tymVar, int i) {
        super("com.google.vr.vrcore.controller.api.IControllerListener");
        this.a = i;
        this.b = new WeakReference(tymVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyq(ControllerServiceBridge controllerServiceBridge, int i) {
        super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
        this.a = i;
        this.b = new WeakReference(controllerServiceBridge);
    }
}
