Project Overview

1️⃣ Alert Event Generator

Port: 8040

Purpose: Triggers alert events and sends them to the webhook URL of the Alert Consumer.

Endpoint:

POST /alerts/trigger - Used to trigger alert events.

2️⃣ Alert Event Receiver
Port: 8050

Purpose: Acts as a webhook receiver, listens for incoming alerts, and processes the alert payload.

Endpoint:

POST /webhook/receive - Listens for alerts sent from Alert Producer.

