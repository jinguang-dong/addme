package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum mej {
    ACTIVITY_ONCREATE_START(true),
    ACTIVITY_ONCREATE_END(true),
    PERMISSIONS_STARTUP_TASK_START(true),
    PERMISSIONS_STARTUP_TASK_END(true),
    WAIT_FOR_CAMERA_DEVICES_TASK_START(true),
    WAIT_FOR_CAMERA_DEVICES_TASK_END(true),
    ONE_CAMERA_CREATION_START(true),
    ACTIVITY_ONSTART_START(false),
    ACTIVITY_ONRESUME_START(false),
    j(false),
    ACTIVITY_SURFACE_VIEW_CREATED(false),
    ACTIVITY_INITIALIZE_START(true),
    ACTIVITY_UI_WIRE_START(true),
    ACTIVITY_UI_WIRE_END(true),
    ACTIVITY_INITIALIZED(true),
    ACTIVITY_FIRST_PREVIEW_FRAME_RECEIVED(false),
    ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED(false),
    ACTIVITY_FIRST_PREVIEW_FRAME_VFE_RENDERED(false),
    ACTIVITY_SHUTTER_BUTTON_DRAWN(false),
    ACTIVITY_SHUTTER_BUTTON_ENABLED(false),
    ACTIVITY_SCRIPT_FINISHED(false, false),
    ACTIVITY_STEADY(false, false);

    public final boolean w;
    public final boolean x;

    mej(boolean z) {
        this(z, true);
    }

    mej(boolean z, boolean z2) {
        this.w = z;
        this.x = z2;
    }
}
